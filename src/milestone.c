/* -------------------------------------
 File   : project.c
 Purpose: Grocery Inventory System
 Author : Jongkuk Lee
 Date   : 2016-12-05
------------------------------------*/
#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <ctype.h>
#include <string.h>
#include <math.h>


// symbolic constants
#define MAX_ITEM_NO 500
#define DATAFILE "inventory.dat"
#define MIN_LIMIT_INT 0
#define MAX_LIMIT_INT 7
#define MIN_LIMIT_SKU 100
#define MAX_LIMIT_SKU 999
#define MAX_LENGTH 20 // of SKU name
#define LINEAR 1
#define FORM 0


// define struct Item


struct Item
{
double price;
int    sku;
int    isTaxed;
int    quantity;
int    minQuantity;
char   name[MAX_LENGTH+1]; // 1 for delimiter
};


// define global constants variable


const double TAX = 0.13; //tax rate


// define the prototypes of functions


void      printWelcome          ( void );
void    printGoodbye            ( void );
void    printTitle              ( void );
void    printFooter             ( double);
void    clearKeyboard           ( void );
void    pause                   ( void );
int     getInt                  ( void );
double  getDouble                       ( void );
int     getIntLimited           ( int, int );
double  getDoubleLimited        ( double, double );
bool    getYesOrNo              ( void );
int     getMenuChoice           ( void );
void    runInventorySystem      ( void );
double  totalAfterTax           ( struct Item );
bool    isQuantityLow           ( struct Item * );
struct  Item enterItem          ( int );
void    displayItem             ( struct Item *, int );
void    listItems                       ( const struct Item [], int );
bool    locateItem              ( const struct Item item[], int, int, int * );
int       loadItems                     ( struct Item* item, char fileName[], int* NoOfRecsPtr );
void    search                  ( const struct Item item[], int NoOfRecs );
void    updateItem              ( struct Item* itemptr );


int main( void )
{
// print the welcome message by function call


printWelcome();


// choose the menu and execute each menu option by function call
runInventorySystem();


// print the good bye message by function call


printGoodbye();


return 0;
}


/* --------------------------------------------------
 function  : printWelcome
 purpose   : print the welcome message
 parameter : void
 result    : void
--------------------------------------------------*/
void printWelcome ( void )
{
printf("\n---=== Welcome to Jongkuk's"
" Grocery Inventory System ===---\n\n");
}


/* --------------------------------------------------
 function  : printGoodbye
 purpose   : print the good-bye message
 parameter : void
 result    : void
--------------------------------------------------*/
void printGoodbye ( void )
{
printf("\n---=== Good-Bye ===---\n\n");
}


/* --------------------------------------------------
 function  : printTitle
 purpose   : print the two lines of title
 parameter : void
 result    : void
--------------------------------------------------*/
void printTitle ( void )
{
printf("Row |SKU| Name               | Price  |"
"Taxed| Qty | Min |   Total    |Atn\n");
printf("----+---+--------------------+--------+"
"-----+-----+-----+------------|---\n");
}


/* --------------------------------------------------
 function  : printFooter
 purpose   : print the one line and grand total
 parameter : gTotal (Double)
 result    : void
--------------------------------------------------*/
void printFooter ( double gTotal )
{
printf("--------------------------------------"
"------------------+----------------\n");
if (gTotal != -1.0000)
{
printf("                              "
"             Grand Total: |   "
"  %.2f\n", gTotal);
}
}


/* --------------------------------------------------
 function  : clearKeyboard
 purpose   : clear input buffer by reading
                 from keyboard character by character
                 until it reads a new line character
 parameter : void
 result    : void
--------------------------------------------------*/
void clearKeyboard ( void )
{
char input;
do
{
scanf("%c", &input);
} while (input != '\n');
}


/* --------------------------------------------------
 function  : pause
 purpose   : (1) pause the execution of the application
 (2) call clearKeyboard function
 parameter : void
 result    : void
--------------------------------------------------*/
void pause ( void )
{
printf("Press <ENTER> to continue...");
clearKeyboard();
}


/* --------------------------------------------------
 function  : getInt
 purpose   : get a valid integer from the keyboard
 parameter : void
 result    : Integer - user's input value
--------------------------------------------------*/
int getInt ( void )
{
int intVal;
char ch;


// ask the user to input a integer value
//      and check if the value is integer
while (scanf("%d%c", &intVal, &ch) != 2 || ch != '\n')
{
printf("Invalid integer, please try again: ");
clearKeyboard();
}
return intVal;
}


/* --------------------------------------------------
 function  : getDouble
 purpose   : get a valid double from the keyboard
 parameter : void
 result    : Double - user's input value
--------------------------------------------------*/
double getDouble ( void )
{
double doubleVal;
char ch;


// ask the user to input a double value
//      and check if the value is double
while (scanf("%lf%c", &doubleVal, &ch) != 2 || ch != '\n')
{
printf("Invalid number, please try again: ");
clearKeyboard();
}
return doubleVal;
}


/* --------------------------------------------------
 function  : getIntLimited
 purpose   : uses getInt() to receive a valid integer
 parameter : lowerLimit (Integer), upperLimit (Integer)
 result    : Integer - user's input value
--------------------------------------------------*/
int getIntLimited ( int lowerLimit, int upperLimit )
{
int intVal;
bool isNotValidFlag = true;
do
{
// ask the user to input a integer value
intVal = getInt();


//check if an input value is between
//      the lower limmit and the upper limit
if (intVal < lowerLimit || intVal > upperLimit)
printf("Invalid value, %d <= value <= %d: ",
lowerLimit, upperLimit);
else
isNotValidFlag = false;
} while (isNotValidFlag);


return intVal;
}


/* --------------------------------------------------
 function  : getDblLimited
 purpose   : uses getDouble() to receive a valid double
 parameter : lowerLimit (double), upperLimit (double)
 result    : Double - user's input value
--------------------------------------------------*/
double getDoubleLimited ( double lowerLimit, double upperLimit )
{
double doubleVal;
bool isNotValidFlag = true;
do
{
// ask the user to input a double value
scanf("%lf%*c", &doubleVal);


//check if a input value is between
//      the lower limmit and the upper limit
if (doubleVal < lowerLimit || doubleVal > upperLimit)
printf("Invalid value, %lf <= value <= %lf: ",
lowerLimit, upperLimit);
else
isNotValidFlag = false;
} while (isNotValidFlag);


return doubleVal;
}


/* --------------------------------------------------
 function  : getYesOrNo
 purpose   : get user's 'yes' or 'no' answer
 parameter : void
 result    : bool (Y, y : true, N, n : false)
--------------------------------------------------*/
bool getYesOrNo ( void )
{
// declare the variables
char answer;


// ask users to input 'yes' or 'no' answer
scanf("%c%*c", &answer);


while (answer != 'Y' && answer != 'y' && answer != 'N' && answer != 'n')
{
// ask users to input whether acceptable or not
printf("Only (Y)es or (N)o are acceptable: ");
scanf("%c%*c", &answer);
}


if (answer == 'Y' || answer == 'y')
return true;
else
return false;
}


/* --------------------------------------------------
 function  : getMenuChoice
 purpose   : display and choose the menu
 parameter : void
 result    : Integer (0 : quit, others : menu options)
--------------------------------------------------*/
int getMenuChoice ( void )
{
// declare the variables
int returnVal;


// print a menu
printf("1- List all items\n");
printf("2- Search by SKU\n");
printf("3- Checkout an item\n");
printf("4- Stock an item\n");
printf("5- Update Item\n");
printf("6- Delete item\n");
printf("7- Search by name\n");
printf("0- Exit program\n");
printf("> ");


// The menu will not accept any number
//              less than 0 or greater than 7
returnVal = getIntLimited(MIN_LIMIT_INT, MAX_LIMIT_INT);
return returnVal;
}


/* --------------------------------------------------
 function  : runInventorySystem
 purpose   : read and set the data file
                 and displays and ask to choose the menu
                 if the user’s selection is 0, quit.
                 otherwise,execute print, search, and update item
 parameter : void
 result    : void
--------------------------------------------------*/
void runInventorySystem ( void )
{
// print the data loading message
printf("Loading inventory data...\n");
pause();


// load the data of items from a file and store in struct array
int noOfRecsPtr;
struct Item * item = malloc(MAX_ITEM_NO*sizeof(struct Item));


// print message with "Cannot open <filename>" if cannot open file
if(!loadItems ( item, DATAFILE, &noOfRecsPtr ))
{
return;
}


// if it is successful to read a file,
//    display and ask to choose menu
bool finishFlag;


do
{
// display the menu by function call
int result = getMenuChoice();


// when user input '0' ( 0 : exit )
if (result == 0)
{
// ask users to input whether exiting or not
printf("Exit the program? (Y)es/(N)o: ");


if (getYesOrNo() == true)
finishFlag = true; // set the flag to stop the loop
}
// when user input ‘1 ~ 7’ (not ‘0’)
else if (result > 0)
{
int rSKU;


// according to the input result in menu,
//      execute functions or display the message
switch (result)
{
// print the item list by function call
case 1: listItems (item, noOfRecsPtr); break;
// search the item of specific SKU by function call
case 2: search (item, noOfRecsPtr); break;
case 3: printf("NOT IMPLEMENTED\n"); break;
case 4: printf("NOT IMPLEMENTED\n"); break;
case 5: printf("Please enter the SKU: ");


// ask the user to input a sku by function call
rSKU = getIntLimited(MIN_LIMIT_SKU, MAX_LIMIT_SKU);


int index; // the variable for location of item


// set the location of item on index variable
if(locateItem(item, noOfRecsPtr, rSKU, &index))
{
printf("Current data:\n");


// print the information of item of the index
displayItem (&item[index], FORM);


// update the information of item of the index
updateItem (&item[index]);
}
// when failing to search the item
else
{
printf("Item not found!\n");
}
break;
case 6: printf("NOT IMPLEMENTED\n"); break;
case 7: printf("NOT IMPLEMENTED\n"); break;
}
// pause the application
pause();


finishFlag = false; // set the default value then loop
}
} while (finishFlag != true); // finish to loop when user input the ‘0’
}


/* --------------------------------------------------
 function  : totalAfterTax
 purpose   : calculates the inventory total price of item
 parameter : item (struct Item)
 result    : double – calculated total price
--------------------------------------------------*/
double totalAfterTax ( struct Item item )
{
// when isTaxed is false
if(item.isTaxed == 0)
return item.price * item.quantity;
// when isTaxed is true
else
return item.price * item.quantity * (1 + TAX);
}


/* --------------------------------------------------
function  : isQuantityLow
purpose   : check whether the item quantity is
less than item minimum quantity
parameter : pItem (struct Item Pointer )
result    : bool – (quantity > minimum : false, otherwise : true)
--------------------------------------------------*/
bool isQuantityLow ( struct Item * pItem )
{
// the quantity is less than minimum quantity
if( pItem -> quantity < pItem -> minQuantity)
return true;
else
return false;
}


/* --------------------------------------------------
 function  : enterItem
 purpose   : creates a new item and sets its values
 parameter : sku (Integer)
 result    : struct Item – store user's input values
--------------------------------------------------*/
struct Item enterItem ( int sku )
{
// declare the variables
bool tax;
struct Item item;


// ask the users to input values
printf("        SKU: %d\n", sku); // do not chanage
printf("       Name: "); scanf("%20[^\n]", item.name);
clearKeyboard();
printf("      Price: "); item.price = getDouble();
printf("   Quantity: "); item.quantity = getInt();
printf("Minimum Qty: "); item.minQuantity = getInt();
printf("   Is Taxed: "); tax = getYesOrNo();


//if( tax == 'y' || tax == 'Y')
if(tax)
item.isTaxed = 1;
else
item.isTaxed = 0;


return item;
}


/* --------------------------------------------------
 function  : displayItem
 purpose   : prints an Item on screen in two different
             formats depending on the value of ‘linear’
 parameter : pItem (struct Item Pointer), linear (Integer)
 result    : void
--------------------------------------------------*/
void displayItem ( struct Item * pItem, int linear )
{
char *taxFlag = "Yes";


// convert the tax from a integer to a format of 'Yes/No'
if ((*pItem).isTaxed == 0)
taxFlag = "No";


        // display as linear type
if (linear == LINEAR)
{
printf("|%3d|%-20s|%8.2f|%5s|%4d |%4d |%12.2lf|",
(pItem) -> sku,
(pItem) -> name,
(pItem) -> price,
taxFlag,
(pItem) -> quantity,
(pItem) -> minQuantity,
totalAfterTax(*pItem));


// if the quantity is low then three asterisks
if(isQuantityLow(pItem) == true)
printf("***\n");
else
printf("\n");
}
else
{
printf("        SKU: %d\n"      ,(pItem)->sku);
printf("       Name: %s\n"      ,(pItem)->name);
printf("      Price: %.2f\n"    ,(pItem)->price);
printf("   Quantity: %d\n"      ,(pItem)->quantity);
printf("Minimum Qty: %d\n"      ,(pItem)->minQuantity);
printf("   Is Taxed: %s\n"      ,taxFlag);


// if the quantity is low then warning
if(isQuantityLow(pItem) == true)
printf("WARNING: Quantity low, please order ASAP!!!\n");
}
}


/* --------------------------------------------------
 function  : listItems
 purpose   : prints the items in list
with the grand total price at the end
 parameter : item (struct Item Array), noOfItems (Integer)
 result    : void
--------------------------------------------------*/
void listItems ( const struct Item item[], int noOfItems )
{
double gTotal = 0.0;


// print the title
printTitle();


// print the list of items
int i;
struct Item argItem;


for(i = 0; i < noOfItems; i++)
{
printf("%-4d", i+1);


argItem = item[i];


// display a specific item by function call
displayItem ( &argItem, LINEAR );


// set the total price of Item by function call
gTotal += totalAfterTax(item[i]);
}


// print the footer
printFooter(gTotal);
}


/* --------------------------------------------------
 function  : locateItem
 purpose   : find a item with a sku
 parameter : item (struct Item Array), noOfRecs (Integer),
             sku (Integer), index (Integer Pointer)
 result    : bool – (if finding : true, otherwise : false)
--------------------------------------------------*/
bool locateItem ( const struct Item item[], int noOfRecs, int sku, int * index )
{
// declare variables
bool findFlag = false;


// find the item of parameter ‘sku’
int i;
for(i = 0; findFlag == false && i < noOfRecs; i++)
{
if(sku == item[i].sku)
{
*index = i; // set the location of item in the index pointer
findFlag = true; // for escaping the loop
}
}


return findFlag;
}


/* --------------------------------------------------
function  : loadItems
purpose   : read the information of Items from text file
and store them in the Item structure
and set the number of Items in "NoOfRecsPtr"
parameter : item (struct Item Pointer), filename (String),
                        noOfRecsPtr (Integer pointer)
result    : Integer (if loading a file : 1; otherwise : 0)
--------------------------------------------------*/
int loadItems ( struct Item* item, char fileName[], int* noOfRecsPtr )
{
// open and read the file
FILE * fp = fopen (fileName, "r");


// if it fails to reading file, return '0'
if (fp == NULL)
{
        printf("Cannot open <%s>\n", fileName);
return 0;
}
else
{
int i = 0;


// store the information of items in struct array
while( fscanf(fp, "%d,%[^,],%lf,%d,%d,%d\n", &((item + i) -> sku),
(item + i) -> name, &((item + i) -> price), &((item + i) -> isTaxed),
&((item + i) -> quantity), &((item + i) -> minQuantity)) !=EOF)
{ i++; }


// set the number of Items in the pointer
*noOfRecsPtr = i;


fclose(fp); // close the file
}


// if it suceeds to reading file, return '1'
return 1;
}


/* --------------------------------------------------
 function  : search
 purpose   : search an item with a specific sku
 parameter : item (struct Item Array), noOfRecs (Integer)
 result    : void
--------------------------------------------------*/
void search ( const struct Item item[], int noOfRecs )
{
int rSKU, index;
printf("Please enter the SKU: ");
rSKU = getIntLimited(MIN_LIMIT_SKU, MAX_LIMIT_SKU);


// find a specific sku by function call
bool findFlag = locateItem ( item, noOfRecs, rSKU, &index);


        // initialize the struct Item which is printed
struct Item argItem = item[index];


// print a specific item information by function call
if (findFlag )
displayItem (&argItem, FORM);
// when failing to find the location of the item
else
printf("Item not found!\n");
}


/* --------------------------------------------------
 function  : updateItem
 purpose   : modifies the fields of an item
 parameter : item (struct Item Pointer)
 result    : void
--------------------------------------------------*/
void updateItem ( struct Item* itemptr )
{
// ask the user to input new information of an item
printf("Enter new data:\n");
struct Item rItem = enterItem(itemptr -> sku);


// ask the user to confirm the update
char overwrite;


printf("Overwrite old data? (Y)es/(N)o: ");


scanf("%c%*c", &overwrite);


        // update the information of the item
if( overwrite == 'y' || overwrite == 'Y')
{
strcpy(itemptr -> name, rItem.name);
itemptr -> price = rItem.price;
itemptr -> isTaxed = rItem.isTaxed;
itemptr -> quantity = rItem.quantity;
itemptr -> minQuantity = rItem.minQuantity;
printf("--== Updated! ==--\n");
}
// abort the update
else
{
printf("--== Aborted! ==--\n");
}
}

package ca.jay.jac444.week6.sample;

/************************************************************************
 *  Compilation:  javac AsciiChar.java
 *  Execution:    java AsciiChar
 *
 * Writes the specified byte to System.out
 *
 *  Output:
 *   	!	"	#	$
 *  %	&	'	(	)	*	+	,	-	.	/	0
 *  1	2	3	4	5	6	7	8	9	:	;	<
 *  =	>	?	@	A	B	C	D	E	F	G	H
 *  I	J	K	L	M	N	O	P	Q	R	S	T
 *  U	V	W	X	Y	Z	[	\	]	^	_	`
 *  a	b	c	d	e	f	g	h	i	j	k	l
 *  m	n	o	p	q	r	s	t	u	v	w	x
 *  y	z	{	|	}	~
 *
 * @author Jordan Anastasiade
 * @version 1.0, 20 Jan 2002
 * @version 1.1, 10 Aug 2017
 ************************************************************************/

public class AsciiChar {

    public static void main(String[] args) {

        for (int i = 32; i < 127; i++) {

            System.out.write(i);
            // break line after every twelve characters
            if (i % 12 == 0)
                System.out.write('\n');
            else
                System.out.write('\t');
        }
        System.out.write('\n');
    }
}
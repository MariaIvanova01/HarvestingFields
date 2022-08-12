# HarvestingFields

You are given a RichSoilLand class with lots of fields (look at the provided skeleton). Like the good farmer you are, you must harvest them. Harvesting means that you must print each field in a certain format (see output).

Input
---------------
You will receive a maximum of 100 lines with one of the following commands:

•	private - print all private fields

•	protected - print all protected fields

•	public - print all public fields

•	all - print ALL declared fields

•	HARVEST - end the input

Output
--------------------
For each command, you must print the fields that have the given access modifier as described in the input section. The format in which the fields should be printed is:
"{access modifier} {field type} {field name}"

Input |	Output
------|-----------
protected| protected String testString
HARVEST| protected double aDouble
<no input>|protected byte testByte
<no input>|protected StringBuilder aBuffer
<no input>|protected BigInteger testBigNumber
<no input>|protected float testFloat
<no input>|protected Object testPredicate
<no input>|protected Object fatherMotherObject
<no input>|protected String moarString
<no input>|protected Exception inheritableException
<no input>|protected Stream moarStreamz

Input |	Output
------|-----------
private |private int testInt
public |private long testLong
private|private Calendar aCalendar
HARVEST|private char testChar
<no input>|private BigInteger testBigInt
<no input>|private Thread aThread
<no input>|private Object aPredicate
<no input>|private Object hiddenObject
<no input>|private String anotherString
<no input>|private Exception internalException
<no input>|private Stream secretStream
<no input>|public double testDouble
<no input>|public String aString
<no input>|public StringBuilder aBuilder
<no input>|public short testShort
<no input>|public byte aByte
<no input>|public float aFloat
<no input>|public Thread testThread
<no input>|public Object anObject
<no input>|public int anotherIntBitesTheDust
<no input>|public Exception justException
<no input>|public Stream aStream
<no input>|private int testInt
<no input>|private long testLong
<no input>|private Calendar aCalendar
<no input>|private char testChar
<no input>|private BigInteger testBigInt
<no input>|private Thread aThread
<no input>|private Object aPredicate
<no input>|private Object hiddenObject
<no input>|private String anotherString
<no input>|private Exception internalException
<no input>|private Stream secretStream

Input |	Output
------|-----------
all|	private int testInt
HARVEST|public double testDouble
<no input>|protected String testString
<no input>|private long testLong
<no input>|protected double aDouble
<no input>|public String aString
<no input>|private Calendar aCalendar
<no input>|public StringBuilder aBuilder
<no input>|private char testChar
<no input>|public short testShort
<no input>|protected byte testByte
<no input>|public byte aByte
<no input>|protected StringBuilder aBuffer
<no input>|private BigInteger testBigInt
<no input>|protected BigInteger testBigNumber
<no input>|protected float testFloat
<no input>|public float aFloat
<no input>|private Thread aThread
<no input>|public Thread testThread
<no input>|private Object aPredicate
<no input>|protected Object testPredicate
<no input>|public Object anObject
<no input>|private Object hiddenObject
<no input>|protected Object fatherMotherObject
<no input>|private String anotherString
<no input>|protected String moarString
<no input>|public int anotherIntBitesTheDust
<no input>|private Exception internalException
<no input>|protected Exception inheritableException
<no input>|public Exception justException
<no input>|public Stream aStream
<no input>|protected Stream moarStreamz
<no input>|private Stream secretStream


### Data types
#### Primitive data types
| Name     | Size (in bytes) | Example         | Range          |
|----------|-----------------|-----------------|----------------|
| byte     | 1               | -128 to 127     | -128 to 127    |
| short    | 2               |                 | -32,768 to 32,767 |
| int      | 4               | 1, 2, 3, 4, ... | -2,147,483,648 to 2,147,483,647 |
| long     | 8               |                 | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| float    | 4               | 3.14            |  |
| double   | 8               | 5.242           |  |
| char     | 2               | a, b, c, d, ... |  |
| boolean  | 1               | true/false      |  |

#### Non-primitive data types
***String***
* String are immutable in java

***Arrays***
* Values of arrays are initialized by 0 or null

***Casting***
* Implicit
* Explicit

***Constants***
* This can be created using 'final' keyword
* Name of constant variables are names using uppercase chars like 'PI', 'TEMP';


### Operators
* Arithmetic Operators: +, -, /, *, %
* Assignment Operators: =, 
* Logical Operators
* Comparison Operators

***Uniary operator***
* ++, --

### Taking inputs
***taking string input***
* sc.next() only takes one word/token as input
* use sc.nextLine() for taking a big string input
* always use empty sc.nextLine() before taking a string input using sc.nextLine()
```java
String name2 = sc.next();
System.out.println("your name is "+name2);

sc.nextLine(); // always use this before taking string input

System.out.println("how are you");
String about = sc.nextLine();
System.out.println("about: "+about);
```




# GuitarSpec-strings

Rick wanted to add 12-strings property to the guitarspec class but it causes changes in [inventory.java](http://inventory.java) and Guitar.java.

### the goal

1. .Modify **Guitar.java** so that the properties of **GuitarSpec** are encapsulated away from the constructor of the class.
2. delegate the match comparison to the **GuitarSpec** since it's not the job of inventory.java class.
3. update FindGuitarTester.java

### The result

Code is more reusable, maintainable and flexible.
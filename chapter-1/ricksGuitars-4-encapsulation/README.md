# GuitarSpec

Rick has found out that the user sends a whole guitar object to the search method but the method is only use the guitar specs .. so the user does not need to send the guitar serial number or the price.

### the goal

Separate the guitar object from its specs to achieve encapsulation.

### the solution

Rick extracted from the guitar object the code that the customer enters to the search method and stored it in a new object and saved a reference to this new object inside the old one.
public class Test{
static{
print(10);
}
static void print (int x) {
System.out.println (x);
System.exit(0);
}
}

//b. Will throw a NoSuchMethod error at runtime  is correct
//There is no main method in this class
// Execution begins from main method
//Will throw a main method error at runtime


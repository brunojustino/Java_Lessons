@SuppressWarnings("WrongPackageStatement")
class Methods {
    public static void main(String[] args) {

        //Methods are blocks of code whew you can reuse it to avoid repetition
        System.out.println(sum(2,2));
        System.out.println(sum(6,-10));
        printHello();

    }

    /*
     First we declare if it's public or private. Here we use the static keyword, so we can use the method
     without having to create an object. Then we define what the method should return. We could also use
     void instead of int, meaning that wouldn't return anything.
     Then we give a name to our method. Inside parenthesis, we define the parameters of the method.
     Parameters are used so the method can be run to different things and values. But we also could have
     a method without any parameter
    */
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printHello() {
        System.out.println("Hello");
    }

}
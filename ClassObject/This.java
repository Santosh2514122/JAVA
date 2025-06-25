package ClassObject;
interface Display
{     // Public method accessible anywhere
    public void showPublic();
    default void showDefault()
    {
        System.out.println("Method in the interface.");
    }
}
// Public class implementing the interface
class AccessModifiers implements Display
{
    // Public method implementation accessible anywhere
    public void showPublic()
    {
        System.out.println("This is a public method.");
    }

    // Protected method (accessible within the same package and subclasses)
    protected void showProtected()
    {
        System.out.println("This is a protected method.");
    }

    // Private method (accessible only within this class)
    private void showPrivate()
    {
        System.out.println("This is a private method.");
    }

    // Package-private default method (accessible within the same package)
    void showPackagePrivate()
    {
        System.out.println("This is a package-private method.");
    }

    // Public method to demonstrate calling private,
    // protected, and package-private methods
    public void demonstrateAccess()
    {

        // Accessible within the class
        showPrivate();

        // Accessible within the class
        showProtected();

        // Accessible within the class
        showPackagePrivate();
    }
}

// Main class
public class This
{

    public static void main(String[] args) {

        // Create an instance of AccessModifiers
        AccessModifiers obj = new AccessModifiers();

        // Access public method
        obj.showPublic();

        // Access default method from the interface
        obj.showDefault();

        // Demonstrate access to private, protected,
        // and package-private methods
        obj.demonstrateAccess();
    }
}
//OUTPUT
//This is a public method.
//Method in the interface.
//This is a private method.
//This is a protected method.
//This is a package-private method

/**
 * My Class demonstrates thescope of variables
 *
 * @author Mairead & Siobhan
 * @version 25-09-2025
 */
class MyClass {
    private int instanceVar;      // Class Scope (object-level)
    
    void myMethod(int param) {    // 'param' has Method Scope
        int localVar = 10;        // Method Scope

        if (localVar > 5) {
            int blockVar = 20;    // Block Scope
            // Accessible here: param, localVar, blockVar, instanceVar
        }

        // Here: param, localVar, instanceVar
        // (blockVar is out of scope)
    }

    // Here: instanceVar
}

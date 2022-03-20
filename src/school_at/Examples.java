package school_at;

public class Examples {
    // Invalid float
    float pi1 = 3_.1415F;
    float pi2 = 3.1415_F;
    //Invalid int
    int a1 = _52;
    int a3 = 52_;
    //Invalid long
    long socialSecurityNumber1  = 999_99_9999_L;
    long socialSecurityNumber2  = _999_99_9999L;

    // Valid float
    float pi3 = 3.14_15F;
    float pi4 = 3.14___15F;
    //Valid int
    int a2 = 5_2;
    int a4 = 5____2;
    //Valid long
    long socialSecurityNumber3  = 999_99_9999L;
    long socialSecurityNumber4  = 999_99_99_99L;
}

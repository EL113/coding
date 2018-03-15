#include <c_primer.h>
#include <stdio.h>
#include <stdlib.h>

int main()
{
    //声明数组，中括号在变量名后面
    char instring[10] = "thisatest";
    //print_name();
	//print_num();
    //chapter3_4();
    //chapter4_2();
    //chapter4_1();
    //chapter4_3();
    //chapter4_6();
    //chapter5_1();
    //chapter5_7();
    //chapter6_1();
    //chapter6_3();
    //chapter6_17();
    //chapter6_18();
    char outstring[10];
    outstring[0] = chline(instring, 2, 5);
    printf("%c", outstring[0]);
    return 0;
}

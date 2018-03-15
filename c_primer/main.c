#include <c_primer.h>
#include <stdio.h>
#include <stdlib.h>
void print_target(double target[]);
int main()
{
    //声明数组，中括号在变量名后面
    //用char指针来表示字符串很方便但是无法赋值给空指针的解引用
    //用char数组表示字符串可以直接赋值给空的数组
    //char* instring = "thisatest";
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
	//chapter7_1();
    //chapter7_2();
    //chapter8_1();
    //chapter8_4();
    //chapter9
    //char outstring[10];
    //chline(instring, outstring, 2, 5);
    //打印字符串的方法
    //printf("%s", outstring);

    //chapter10
    //double source[5] = {1.1, 1.5, 1.3, 2.2, 1.23};
    //double target1[5];
    //double target2[5];
    //double target3[5];
    //copy_arr(target1, source, 5);
    //copy_ptr(target2, source, 5);
    //copy_ptrs(target3, source, source+5);
    //print_target(target3);

    //chapter11

    return 0;
}

void print_target(double target[]){
    int i = 0;
    for(i; i < 5; i++){
        printf("%f,\n", *(target+i));
    }
}


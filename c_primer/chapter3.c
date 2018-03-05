#include <c_primer.h>

/**
*%d表示以十进制打印该值，加上类型表示打印的是哪种类型的值，
*如果打印类型过小，会出现截断的情况，如第19行
*/
void print_num(){
    int num = 12;
    unsigned int unint = 300000 ;
    short end = 200;
    long big = 65537;
    long long sbig = 12345678908642;

    printf("-----------------打印八进制和十六进制----------\n");
    printf("signed int: %d \n",num);
    printf("octal:%o; hex:%x\n", num, num);
    printf("octal sign:%#o; hex sign:%#x \n", num, num);
    printf("-----------------打印其他类型值-------------\n");
    printf("unsigned int: %u \n", unint);
    printf("short:%hd or %d \n", end, end);
    printf("long: %ld, wrong type:%d \n", big);
    printf("long long:%lld", sbig);

    char chartest = 'l';
    printf("-------------------打印字符---------------------\n");
    printf("char: %c \n", chartest);

    printf("-------------------打印浮点型------------------\n");
    /** \brief
     *打印浮点数，float的普通格式 %f，double的普通格式 %Lf，
     *科学计数法 %e, 十六进制 %a；long double类型添加L
     */

    float floatde = 12.7;
    double doublede = 2.14e9;
    long double ldoublede = 5.32e-6;

    printf("%f can be written as %e \n", floatde, floatde);
    printf("print as hexadecimal: %a \n", floatde);
    printf("print double: %f, also as %e \n", doublede, doublede);
    printf("print long double as %Lf or %Le \n", ldoublede, ldoublede);
}

void chapter3_4(){
    double floatde;
    printf("please enter a double num:");
    scanf("%Lf", &floatde);

    printf("fixed-point notation:%f \n", floatde);
    printf("exponential notation:%e \n", floatde);
    printf("p notation: %a \n", floatde);
}

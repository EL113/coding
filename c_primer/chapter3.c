#include <c_primer.h>

/**
*%d��ʾ��ʮ���ƴ�ӡ��ֵ���������ͱ�ʾ��ӡ�����������͵�ֵ��
*�����ӡ���͹�С������ֽضϵ���������19��
*/
void print_num(){
    int num = 12;
    unsigned int unint = 300000 ;
    short end = 200;
    long big = 65537;
    long long sbig = 12345678908642;

    printf("-----------------��ӡ�˽��ƺ�ʮ������----------\n");
    printf("signed int: %d \n",num);
    printf("octal:%o; hex:%x\n", num, num);
    printf("octal sign:%#o; hex sign:%#x \n", num, num);
    printf("-----------------��ӡ��������ֵ-------------\n");
    printf("unsigned int: %u \n", unint);
    printf("short:%hd or %d \n", end, end);
    printf("long: %ld, wrong type:%d \n", big);
    printf("long long:%lld", sbig);

    char chartest = 'l';
    printf("-------------------��ӡ�ַ�---------------------\n");
    printf("char: %c \n", chartest);

    printf("-------------------��ӡ������------------------\n");
    /** \brief
     *��ӡ��������float����ͨ��ʽ %f��double����ͨ��ʽ %Lf��
     *��ѧ������ %e, ʮ������ %a��long double�������L
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

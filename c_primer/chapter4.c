#include <c_primer.h>
#include <stdio.h>
#include <string.h>

void chapter4_2(){
    //ֱ�Ӱѿ�ѧ�������ĸ�������ʾ������ͨ��ʽ�ĸ�����
    printf("He sold the painting for $%2.2f", 2.2e2);
}

// �ַ�����ӡʹ��%s��char���ʹ�ӡ��%c��scanf()��ȡ�ַ����Կհ׽�����Ҳ����һ���Զ�ȡ����ַ�
void chapter4_1(){
    char firstName[10];
    char lastName[10];
    printf("please enter your first name and last name:");
    scanf("%s %s", firstName, lastName);
    printf("all right, your name is %s, %s", firstName, lastName);
}

void chapter4_3(){
    float floatTest = 21.29;
    printf("normal float: %+2.3f, e type float: %+1.3e", floatTest, floatTest);
}

void chapter4_6(){
    int lengthFisrtName;
    int lengthLastName;
    char firstName[10];
    char lastName[10];
    printf("enter your first and last name:");
    scanf("%s %s", firstName, lastName);
    printf("%10s %10s\n", firstName, lastName);
    printf("%10d %10d", strlen(firstName), strlen(lastName));
}


#include <c_primer.h>
#include <string.h>
#include <stdio.h>

int copy_arr(double target1[], double source[], int len){
    int index;
    for(index=0; index < len; index++){
        target1[index] = source[index];
    }
    return 1;
}

//������Ϊ��ʽ�������ǰ�ֵ���������ͷһ��Ԫ�صĵ�ַ��
//�������ַ���н����ú���еĲ�����ı�����
//����ָ��Ҳһ����ֻ�ܶ����ָ����н�����Ȼ����в������ܸı�ԭֵ
//ָ��Ҳ�Ǳ������������һ�������ĵ�ַ
int copy_ptr(double target2[], double source[], int len){
    int index;
    for(index=0; index < len; index++){
        *target2++ = *source++;
    }

    return 1;
}

int copy_ptrs(double target1[], double source[], double * lastptr){
    while(source <= lastptr){
        *target1++ = *source++;
    }

}

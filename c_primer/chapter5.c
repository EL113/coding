#include <c_primer.h>
#define TIME_CONST 60

void chapter5_1(){
    int hour;
    int minute;
    int seconds;
    int totalSeconds = 0;

    printf("please enter seconds number you want to transfer:\n");
    while(totalSeconds >= 0){
        scanf("%d", &totalSeconds);
        minute = totalSeconds / TIME_CONST;
        hour = minute / TIME_CONST;
        minute %= TIME_CONST;
        seconds = totalSeconds % TIME_CONST;
        printf("the total seconds is %d, it's %d hours %d minutes %d seconds\n",
               totalSeconds, hour, minute, seconds);
        printf("want enter again? enter -1 quite\n");
    }
    printf("bye\n");
}

void chapter5_7(){
    float pow1;
    char quitChar = 'a';
    float result;

    while(quitChar != 'q'){
        printf("enter power1:\n");
        scanf("%f", &pow1);
        result = pow1 * pow1 * pow1;
        printf("%5.1f triple is %5.1f\n", pow1, result);
        printf("press any to continue, press q to quit\n");
        scanf("%c", &quitChar);
    }
    printf("bye");
}

    //별의 탑을 쌓자.
    //층 수만큼 별을 쌓아라.
    //맨 위에는 하나의 별만 있게 한다/
    //아래쪽으로 갈수록 별의 갯수가 2개씩 늘어난다.
    function star() {
        let answer = '';
        let c = '*'; //별 입력
        let n = []; //반복할 숫자 입력
        
        for(let i = 0; i <= n; i++){
            answer+= c[i] + "<br>"; 
            for(let j = 0; j < n; j++){
                answer+= c + c(j)*2;
            }
        }
        return answer;
    }
    console.log(star(3));

    // 일단 코드를 쳐보고 막히는 부분이 있을건데
    // 왜 막힌지를 처음부터 봐야함
function solution() {
    let arr1 = [[1,2],[2,3]] ;
    let arr2 = [[3,4],[5,6]] ;
    let answer = [[],[]];
    for(let i = 0; i<arr1.length; i++) {
        for(let j = 0; j<arr1[i].length; j++) {
            answer[i][j] = arr1[i][j] + arr2[i][j];
        }
    }
    document.write(answer);
    return answer;
}
solution()
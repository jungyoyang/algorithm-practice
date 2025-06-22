🛠️틀린 부분 정리
for(i=0; i<list1[].length; i++){
    for(j=0; j<list2[].length; j++){
        if(list1[i]=list[j] && list1[i])

list1[] 은 배열이 아닌 연결 리스트라서 .length를 쓸 수 없습니다.

list1[i] 도 배열 접근 방식이라 사용할 수 없습니다.

if(list1[i]=list[j] 는 = (할당)이고, == (비교)로 바꿔야 합니다.

무엇을 하려는지 논리도 정확히 안 잡혀 있어요.





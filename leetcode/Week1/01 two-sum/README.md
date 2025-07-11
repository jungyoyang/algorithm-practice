## 🤯 내가 몰랐던 점과 배운 것

if (nums[i] + nums[j] == target) {
    return new int[] {i, j};
    return null; // ← 이건 절대 실행되지 않아요!
}

----

for (...) {
    for (...) {
        if (...) {
            return new int[] {i, j};
        }
    }
}
return null; // 두 수를 못 찾았을 때를 위한 대비

즉, 모든 경우를 다 돌았는데도 못 찾았을 때 실행되도록 for문 바깥에 있어야 한다.



return new int[] {i,j}; //new가 들어가야함



You may assume that each input would have exactly one solution." 이 조건은 뭔 말일까

📘 해석:
입력은 반드시 하나의 정답만 존재한다고 가정해도 좋습니다.

즉, 어떤 nums 배열과 target 값이 주어지면,
딱 하나의 정답 조합만 존재해도된다 뜻이다

🧠 의미:
중복된 정답을 고려하지 않아도 된다

예외 처리나 여러 해를 찾는 코드를 쓸 필요가 없다.

정답을 찾는 즉시 return 해도 괜찮다.

----
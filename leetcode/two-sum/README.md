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

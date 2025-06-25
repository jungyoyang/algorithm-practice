투 포인터 알고리즘 (Two Pointers)
문자열의 양 끝을 가리키는 포인터를 두고, 점점 가운데로 좁혀가며 비교


int i = 0;
int j = s.length() - 1;
while (i <= j) {
    if (s.charAt(i) != s.charAt(j)) return false;
    i++;
    j--;
}

공간 복잡도: O(1)

시간 복잡도: O(n)

→ 효율적인 문자열 비교 방식


^의 의미는?
정규표현식(Regex)에서 대괄호 [] 안의 ^는:

"부정(not)" — 괄호 안의 문자들을 제외한 것을 뜻합니다.
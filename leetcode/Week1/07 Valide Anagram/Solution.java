class Solution {
    public boolean isAnagram(String s, String t) {
if (s.length() != t.length()) return false;

    Map<Character, Integer> mapS = new HashMap<>();
    Map<Character, Integer> mapT = new HashMap<>();

    // s 문자 개수 세기
    for (char c : s.toCharArray()) {
        mapS.put(c, mapS.getOrDefault(c, 0) + 1);
    }

    // t 문자 개수 세기
    for (char c : t.toCharArray()) {
        mapT.put(c, mapT.getOrDefault(c, 0) + 1);
    }

    // 두 map이 같은지 비교
    return mapS.equals(mapT);


    }
}
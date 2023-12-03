class Solution(object):
    def reverseWords(self, s):
        words = s.split()
        reversed_words = words[::-1]
        result = ' '.join(reversed_words)
        return result

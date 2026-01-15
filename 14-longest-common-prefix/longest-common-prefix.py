class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        """ Returns longest common prefix of words in array """

        # lets grab the first word to compare
        anchor = strs[0]
        # lets initilize our return value
        prefix = ""

        # we need to loop through and compare chars at specefic indexes
        # we will use our anchor 
        for i in range(len(anchor)):
            # now we can scan every word in strs
            for word in strs:
                # we need to check for wrong value, or short word so we dont get an index out of bounds
                if len(word) <= i or word[i] != anchor[i]:
                    return prefix

            # after scanning every word and they meet criteria then append
            prefix += anchor[i]

        return prefix            
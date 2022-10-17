class Node
{
    public:
    Node *arr[26];
    int prefixCount=0;
    bool containsKey(char ch)
    {
        return arr[ch-'a']!=NULL;
    }
    
    void put(char ch, Node *node)
    {
        arr[ch-'a']=node;
    }
    Node *get(char ch)
    {
        return arr[ch-'a'];
    }
    void incrementPrefix()
    {
        prefixCount++;
    }
    int getPrefix()
    {
        return prefixCount;
    }
};

class TrieNode
{
    private : Node *root;
    public:
    
    
    TrieNode() {
        root= new Node();
    }
    
    void insert(string word) {
        Node *temp=root;
        for(int i=0;i<word.size();i++)
        {
            if(!temp->containsKey(word[i]))
            {
                temp->put(word[i],new Node());
            }
            temp=temp->get(word[i]);
            temp->incrementPrefix();
        }
        
    }
    
    int search(string word) {
        Node *temp=root;
        int ans=0;
         for(int i=0;i<word.size();i++)
        {
            if(!temp->containsKey(word[i]))
            {
                
                return ans;
            }
            ans+=temp->getPrefix();
            temp=temp->get(word[i]);
        }
        return ans+temp->getPrefix();
        
    }
};


class Solution {
public:
    vector<int> sumPrefixScores(vector<string>& words) {
        
        vector<int>ans;
        TrieNode *t=new TrieNode();
        for(auto i:words)
        {
            t->insert(i);
        }
        for(auto i:words)
        {
            ans.push_back(t->search(i));
        }
        return  ans;
    }
};

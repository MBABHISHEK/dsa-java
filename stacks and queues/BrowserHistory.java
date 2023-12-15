class BrowserHistory {

    Stack<String> bStack = new Stack<>();
    Stack<String> fStack = new Stack<>();
    public BrowserHistory(String homepage) {
        bStack.push(homepage);
    }
    
    public void visit(String url) {
        while(!fStack.isEmpty()) fStack.pop();
        bStack.push(url);

    }
    
    public String back(int steps) {
        while(bStack.size()>1 && steps-- > 0){
           fStack.push(bStack.peek());
           bStack.pop();
        }
        return bStack.peek();
        }
    
    
    public String forward(int steps) {
        while(!fStack.isEmpty() && steps-- > 0){
            bStack.push(fStack.peek());
            fStack.pop();
        }
        return bStack.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */

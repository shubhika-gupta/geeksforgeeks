//implement strstr
class GfG
{
    int strstr(String str, String target)
    {
       // Your code here
       if(str.contains(target)){
           return str.indexOf(target);
       }
       else
       return -1;
    }
}
//atoi
class GfG
{
    int atoi(String str)
    {
	if(str.charAt(0)=='-'){
	for(int i=1;i<str.length();i++){
	    if(!Character.isDigit(str.charAt(i))){
	        return -1;
	    }
	}
	return Integer.parseInt(str);
    }
    else{
        for(int i=0;i<str.length();i++){
	    if(!Character.isDigit(str.charAt(i))){
	        return -1;
	    }
	}
	return Integer.parseInt(str);
    }
    }
}

def solution(new_id): 
    new_id = new_id.lower() 
    
    rmv = '~!@#$%^&*()=+[{]}:?,<>/' 
    for r in rmv: 
        new_id = new_id.replace(r,'') 
    
    while('..' in new_id): 
        new_id = new_id.replace('..','.') 
    
    new_id = new_id.strip('.') 
    
    if len(new_id)==0: 
        new_id = 'a' 
    elif len(new_id)>=16: 
        new_id = new_id[:15] 
        new_id = new_id.rstrip('.') 
    if len(new_id)<3: 
        while(len(new_id)<3): 
            new_id = new_id + new_id[len(new_id)-1] 
    
    return new_id

# https://edorrr.tistory.com/41

def solution(lottos, win_nums): 
    answer = [] 
    wcount = zcount = 0 
    for n in lottos: 
        if n in win_nums: 
            wcount += 1 
        if n == 0: 
            zcount += 1
    if wcount+zcount >= 2: 
        answer.append(7-wcount-zcount) 
    else: 
        answer.append(6) 
    if wcount >= 2: 
        answer.append(7-wcount)
    else: 
        answer.append(6) 
    return answer

# https://edorrr.tistory.com/40 

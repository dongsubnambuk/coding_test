def solution(arr):
    answer = []
    
    i =0
    while i < len(arr):
        if len(answer) == 0: answer.append(arr[i])
        elif answer[-1] != arr[i]:
            answer.append(arr[i])
        i+=1
            
        
    return answer
   
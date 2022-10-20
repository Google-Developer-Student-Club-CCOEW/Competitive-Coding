class Solution:
    def countDaysTogether(self, arriveAlice: str, leaveAlice: str, arriveBob: str, leaveBob: str) -> int:
        arr = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
        totalAlice = arriveAlice.split("-")
        totalAliceLeave = leaveAlice.split("-")
        am = int(totalAlice[0]) - 1
        adstart = sum(arr[:am]) +  int(totalAlice[1])
        am = int(totalAliceLeave[0]) - 1
        adend = sum(arr[:am]) +  int(totalAliceLeave[1])
        print(adstart, adend)
        
        totalBob = arriveBob.split("-")
        totalBobLeave = leaveBob.split("-")
        bm = int(totalBob[0]) - 1
        bdstart = sum(arr[:bm]) +  int(totalBob[1])
        bm = int(totalBobLeave[0]) - 1
        bdend = sum(arr[:bm]) +  int(totalBobLeave[1])
        
        print(bdstart, bdend)
        answer =   min(bdend, adend)  - max(adstart, bdstart)+1
        if answer >0:
            return answer
        return 0

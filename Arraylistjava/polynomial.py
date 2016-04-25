"""class Polynomial:
    
    def __init__(self,co,exp):
        self.coe = co
        self.expo = exp
        self.lists = [(self.coe,self.expo)]
        
    def insert(self,co,exp):
        self.lists.append((co,exp))
        self.lists.sort(key=lambda x: x[1])
        
    def tostring(self):
        if self.expo > 1:
            return str(self.coe) + "X^" + str(self.expo)
        elif self.expo == 1:
            return str(self.coe) + "X"
        else:
            return str(self.coe)
            
    def reverse(self):
        self.lists.reverse()
            
    def remove(self,co,exp):
        self.lists.remove((co,exp))

    def product(self):
        coeproduct = 1
        coeexpo = 1
        for i in self.lists:
            coeproduct *= i[0]
        for i in self.lists:
            coeexpo *= i[1]
        """
    

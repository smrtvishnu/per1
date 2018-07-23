    assignments[variable] = random.choice(domains[variable])
         for _ in xrange(self._steps):
             conflicted = False
-            lst = domains.keys()
+            lst = list(domains.keys())
             random.shuffle(lst)
             for variable in lst:
                 # Check if variable is not in conflict

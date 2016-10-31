(ns chapters.chapter-1)

(defn abs
  [x]
  (cond (< x 0) (- x)
        (>= x 0) x))

(defn sum-of-max-squares
  "takes three numbers as arguments and returns the sum of the squares of the two larger numbers."
  [x, y, z]
  (- (+ x y z) (min x y z)))


(ns chapters.chapter-1)

(defn sq
  [x]
  (* x x))

(defn abs
  [x]
  (cond (< x 0) (- x)
        (>= x 0) x))

(defn a-plus-abs-b
  [a b]
  ((if (> b 0) + -) a b))

(defn sum-of-squares
  [x y]
  (+ (sq x)
     (sq y)))

(defn sum-of-max-squares
  "takes three numbers as arguments and returns the sum of the squares of the two larger numbers."
  [x, y, z]
  (cond (and (<= x y) (<= x z)) (sum-of-squares y z)
        (and (<= y z) (<= y x)) (sum-of-squares x z)
        (and (<= z x) (<= z y)) (sum-of-squares x y)))

(defn average
  [x y]
  (/ (+ x y)
     2))

(defn improve-guess
  [guess x]
  (average guess (/ x guess)))

(defn good-enough?
  [guess x]
  (> 0.00001
     (abs (- (sq guess)
             x))))

(defn good-enough-incremental-precision?
  [guess x]
  (let [improved-guess (improve-guess guess x)]
    (> 0.00001
       (/ (abs (- improved-guess
                  guess))
          guess))))

(defn sqrt-guess
  [guess x]
  (if (good-enough? guess x)
    guess
    (sqrt-guess (improve-guess guess x)
                x)))

(defn sqrt-guess-incremental-precision
  [guess x]
  (if (good-enough-incremental-precision? guess x)
    guess
    (sqrt-guess-incremental-precision (improve-guess guess x)
                                      x)))

(defn sqrt
  [x]
  (sqrt-guess 1.0 x))

(defn sqrt-incremental-precision
  [x]
  (sqrt-guess-incremental-precision 1.0 x))

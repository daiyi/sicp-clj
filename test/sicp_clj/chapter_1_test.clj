(ns sicp-clj.chapter-1-test
  (:require [clojure.test :refer :all]
            [chapters.chapter-1 :refer :all]))

(deftest test-test
  (testing "Chapter 1"
    (testing "abs"
      (is (= (abs -4) 4))
      (is (= (abs 0) 0))
      (is (= (abs 3) 3)))
    (testing "1.3 - sum of max squares"
      (is (= 13 (sum-of-max-squares 3 2 1)))
      (is (= 16 (sum-of-max-squares 0 0 4)))
      (is (= 4 (sum-of-max-squares -5 0 -2)))
      (is (= 8 (sum-of-max-squares 2 2 2))))
    (testing "1.4 - operators as compound expressions"
      (is (= (- 1)
             (a-plus-abs-b (- 2) (- 1)))))
    (testing "sqrt"
      (is (< (abs (- (sq (sqrt 2))
                     2))
             0.00001)))))

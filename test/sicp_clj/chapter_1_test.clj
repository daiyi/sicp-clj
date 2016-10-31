(ns sicp-clj.chapter-1-test
  (:require [clojure.test :refer :all]
            [chapters.chapter-1 :refer :all]))

(deftest test-test
  (testing "Chapter 1"
    (testing "abs"
      (is (= (abs -4) 4))
      (is (= (abs 0) 0))
      (is (= (abs 3) 3)))
    (testing "1.3"
      (is (= 5 (sum-of-max-squares 3 2 1)))
      (is (= 4 (sum-of-max-squares 0 0 4)))
      (is (= -2 (sum-of-max-squares -5 0 -2))))
    ))

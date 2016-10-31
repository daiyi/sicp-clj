(ns sicp-clj.core
  (:gen-class)
  (:require [chapters.chapter-1 :as chapter-1]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World! +++")
  (println (chapter-1/abs 3)))

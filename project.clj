(defproject sicp-clj "0.1.0-SNAPSHOT"
  :description "SICP problem sets in clojure"
  :url "http://daiyi.co"
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot sicp-clj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})

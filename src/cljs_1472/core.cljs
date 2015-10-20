(ns cljs-1472.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (apply println args))

(set! *main-cli-fn* -main)

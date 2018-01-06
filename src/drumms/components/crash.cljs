(ns drumms.components.crash
  (:require [drumms.components.drumm :refer [drumm]]))


(defn crash
  "Crash"
  [{:keys [x y]}]
  [drumm {:size  1.27
          :sound :crash
          :type  :cymbal
          :name  "Crash"
          :x x
          :y y}])

(ns drumms.components.snare
  (:require [drumms.components.drumm :refer [drumm]]))


(defn snare
  "Snare drumm"
  [{:keys [x y]}]
  [drumm {:size  1.2
          :sound :snare
          :type  :drumm
          :name  "Snare"
          :x x
          :y y}])

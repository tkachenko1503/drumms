(ns drumms.components.small-tom
  (:require [drumms.components.drumm :refer [drumm]]))


(defn small-tom
  "Small tom"
  [{:keys [x y]}]
  [drumm {:size  1
          :sound :small-tom
          :type  :drumm
          :name  "Small-Tom"
          :x x
          :y y}])

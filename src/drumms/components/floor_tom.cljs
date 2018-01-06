(ns drumms.components.floor-tom
  (:require [drumms.components.drumm :refer [drumm]]))


(defn floor-tom
  "Floor tom"
  [{:keys [x y]}]
  [drumm {:size  1.29
          :sound :floor-tom
          :type  :drumm
          :name  "Floor-Tom"
          :x x
          :y y}])

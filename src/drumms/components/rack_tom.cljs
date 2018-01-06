(ns drumms.components.rack-tom
  (:require [drumms.components.drumm :refer [drumm]]))


(defn rack-tom
  "Rack tom"
  [{:keys [x y]}]
  [drumm {:size  1.1
          :sound :rack-tom
          :type  :drumm
          :name  "Rack-Tom"
          :x x
          :y y}])

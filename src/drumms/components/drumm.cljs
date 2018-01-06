(ns drumms.components.drumm
  (:require [re-frame.core :refer [dispatch]]
            [drumms.components.text :refer [text]]
            [drumms.events :as events]))


(def drum-common-attrs
  {:stroke       "#000"
   :stroke-width 0.01
   :style        {:transform-origin "50% 50%"}})

(def drum-animation
  [:animateTransform
   {:attributeType "XML"
    :attributeName "transform"
    :type          "scale"
    :from          1
    :to            1.04
    :dur           "0.1s"
    :begin         "click"}])

(defn cymbal?
  "Answers is type is cymbal"
  [type]
  (= type :cymbal))


(defn drumm
  "Returns markup for single drum"
  [{:keys [size sound type name x y]}]
  (let [drumAttrs (merge
                    drum-common-attrs
                    {:on-click #(dispatch [::events/play sound])
                     :fill     (if (cymbal? type) "#FFCC80" "#FAFAFA")})]

    [:g drumAttrs
     [:circle {:r  size
               :cx x
               :cy y}]

     (when-not (cymbal? type)
       [:circle {:r            (- size 0.05)
                 :cx           x
                 :cy           y
                 :stroke-width 0.03}])

     [text {:x x
            :y y}
      name]

     drum-animation]))

(ns drumms.core-test
  (:require [cljs.test :refer-macros [deftest testing is]]
            [drumms.events :as events]))


;Events tests
(deftest events-play
  (testing "play drumm event"
    (let [db (-> {}
                 (events/initialize-db [:initialise-db]))
          sound :snare
          event [::events/play sound]
          result (events/play db event)]

      (is (=
            result
            {::play-sound :snare})))))

package com.liquorsgolden.lq.shared.utils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SectionsNamesEnum {

  CHILDREN("children"),
  CHILD("child"),
  EDUCATION("education"),
  WORK_EXPERIENCE("work_experience"),
  RECOGNITION("recognition"),
  NAME_LASTNAME("name_lastname"),
  PUBLICATION("publication"),
  CERTIFICATES("certificates");

  private final String value;
}


final class vu {

   static int b;
   static int c;
   static int a;


   static final void a(Object[] var0, int var1) {
      var0[15] = new byte[10][];
      ++b;
      if(var1 != -28785) {
         a(((byte[])((byte[])var0[0]))[3], (Object[])((Object[])var0[4]), (Object[])null, (int[])((int[])var0[3]), (Object[])null, (Object[])null);
      }

      var0[10] = jta.a((byte)-84, (byte[])null, new Object[3]);
      var0[13] = jta.a((byte)-120, (byte[])null, new Object[3]);
   }

   static final Object[] a(byte var0, Object[] var1, Object[] var2, int[] var3, Object[] var4, Object[] var5) {
      kt.a(var0 ^ -8, var4);
      ++a;
      if(var0 != -2) {
         return (Object[])null;
      } else if(null != var1 && -3 == ~var1.length) {
         return null;
      } else {
         uga var34 = new uga(var4);
         var4[3] = var2;
         var4[13] = var1;
         var4[2] = var34;
         var4[4] = var5;
         int var35 = mc.a(false, (Object[])((Object[])var4[4])) - (((aa)(var2 == null?null:var2[6])).g >> 1);
         ((int[])((int[])var4[1]))[5] = -var35 + lba.a((Object[])((Object[])var4[4]), var0 - 25697) >> ((aa)(var2 != null?var2[6]:null)).a;
         ((int[])((int[])var4[1]))[0] = lba.a((Object[])((Object[])var4[4]), var0 ^ 25699) + var35 >> ((aa)(var2 != null?var2[6]:null)).a;
         ((int[])((int[])var4[1]))[2] = fn.a((Object[])((Object[])var4[4]), 114) + -var35 >> ((aa)(var2 != null?var2[6]:null)).a;
         ((int[])((int[])var4[1]))[3] = fn.a((Object[])((Object[])var4[4]), 3) + var35 >> ((aa)(var2 != null?var2[6]:null)).a;
         int var36 = ((int[])((int[])var4[1]))[0] - (((int[])((int[])var4[1]))[5] - 1);
         int var37 = 1 + (((int[])((int[])var4[1]))[3] - ((int[])((int[])var4[1]))[2]);
         var4[8] = new float[1 + var36][1 + var37];
         var4[5] = new float[var36 + 1][var37 + 1];
         var4[9] = new float[1 + var36][1 + var37];

         int var38;
         int var39;
         int var42;
         int var43;
         int var40;
         int var41;
         for(var38 = 0; var38 <= var37; ++var38) {
            var39 = ((int[])((int[])var4[1]))[2] + var38;
            Object[] var11;
            if(0 < var39 && -1 + ((aa)(null != (var11 = (Object[])((Object[])var4[3]))?var11[6]:null)).h > var39) {
               for(var40 = 0; var40 <= var36; ++var40) {
                  var41 = ((int[])((int[])var4[1]))[5] + var40;
                  Object[] var12;
                  if(var41 > 0 && ~var41 > ~(((aa)((var12 = (Object[])((Object[])var4[3])) != null?var12[6]:null)).f_i - 1)) {
                     var42 = ((aa)(var2 == null?null:var2[6])).b(var0 - 108, var39, 1 + var41) - ((aa)(var2 != null?var2[6]:null)).b(-99, var39, -1 + var41);
                     var43 = ((aa)(null != var2?var2[6]:null)).b(-58, var39 + 1, var41) - ((aa)(var2 != null?var2[6]:null)).b(-65, var39 - 1, var41);
                     float var44 = (float)(1.0D / Math.sqrt((double)(var42 * var42 - -65536 + var43 * var43)));
                     ((float[][])((float[][])var4[9]))[var40][var38] = (float)var42 * var44;
                     ((float[][])((float[][])var4[8]))[var40][var38] = -256.0F * var44;
                     ((float[][])((float[][])var4[5]))[var40][var38] = (float)var43 * var44;
                  }
               }

               if(null != var1 && var1.length == 2) {
                  iw.a(-25, 103, -8, 64, (byte)15, (Object[])null, 127, 62);
               }
            }
         }

         var38 = 0;

         for(var39 = ((int[])((int[])var4[1]))[2]; var39 <= ((int[])((int[])var4[1]))[3]; ++var39) {
            if(var39 >= 0 && var39 < ((aa)(var2 == null?null:var2[6])).h) {
               for(var40 = ((int[])((int[])var4[1]))[5]; var40 <= ((int[])((int[])var4[1]))[0]; ++var40) {
                  if(0 <= var40 && ~var40 > ~((aa)(null != var2?var2[6]:null)).f_i) {
                     var41 = var3[var38];
                     int[] var48 = ((int[][][])((int[][][])var2[19]))[var40][var39];
                     if(var48 != null && var41 != 0) {
                        if(var41 == 1) {
                           var43 = 0;

                           while(var48.length > var43) {
                              if(~var48[var43++] != 0 && 0 != ~var48[var43++] && 0 != ~var48[var43++]) {
                                 ((int[])((int[])var4[1]))[4] += 3;
                              }
                           }

                           if(var2 != null && (var2.length == 1 || var2.length == 13)) {
                              return null;
                           }
                        } else {
                           ((int[])((int[])var4[1]))[4] += 3;
                        }
                     }
                  }

                  ++var38;
               }
            } else {
               var38 += ((int[])((int[])var4[1]))[0] + -((int[])((int[])var4[1]))[5];
            }
         }

         if(0 >= ((int[])((int[])var4[1]))[4]) {
            var4[6] = null;
            var4[10] = null;
            var4[7] = null;
            var4[12] = null;
         } else {
            var4[11] = hi.newByteBufferWrapper(((int[])((int[])var4[1]))[4] * 2);
            var4[0] = jaa.a(new Object[3], ((int[])((int[])var4[1]))[4] * 16, false);
            var4[14] = nb.a((byte)63, fda.a(((int[])((int[])var4[1]))[4], (byte)81), new Object[5]);
            var38 = 0;
            var39 = 0;

            for(var40 = ((int[])((int[])var4[1]))[2]; var40 <= ((int[])((int[])var4[1]))[3]; ++var40) {
               if(0 <= var40 && var40 < ((aa)(var2 == null?null:var2[6])).h) {
                  if(null != var1 && 26 == var1.length) {
                     a((byte)-2, (Object[])null, (Object[])null, (int[])null, (Object[])null, (Object[])null);
                  }

                  var41 = 0;

                  for(var42 = ((int[])((int[])var4[1]))[5]; var42 <= ((int[])((int[])var4[1]))[0]; ++var42) {
                     if(0 <= var42 && ~var42 > ~((aa)(var2 != null?var2[6]:null)).f_i) {
                        var43 = var3[var38];
                        int[] var49 = ((int[][][])((int[][][])var2[19]))[var42][var40];
                        if(null != var49 && 0 != var43) {
                           if(1 == var43) {
                              int[] var45 = ((int[][][])((int[][][])var2[12]))[var42][var40];
                              if(null != var2 && var2.length == 6) {
                                 iw.a(75, -122, -29, -25, (byte)15, (Object[])null, 9, -96);
                              }

                              int[] var46 = ((int[][][])((int[][][])var2[18]))[var42][var40];
                              int var47 = 0;

                              while(var49.length > var47) {
                                 if(-1 != var49[var47] && 0 != ~var49[1 + var47] && ~var49[var47 + 2] != 0) {
                                    iw.a(var41, var40, var45[var47], var39, (byte)15, var4, var42, var46[var47]);
                                    ++var47;
                                    iw.a(var41, var40, var45[var47], var39, (byte)15, var4, var42, var46[var47]);
                                    ++var47;
                                    iw.a(var41, var40, var45[var47], var39, (byte)15, var4, var42, var46[var47]);
                                    ++var47;
                                 } else {
                                    var47 += 3;
                                 }
                              }
                           } else if(var43 == 3) {
                              iw.a(var41, var40, 0, var39, (byte)15, var4, var42, 0);
                              iw.a(var41, var40, ((aa)(null == var2?null:var2[6])).g, var39, (byte)15, var4, var42, 0);
                              iw.a(var41, var40, 0, var39, (byte)15, var4, var42, ((aa)(var2 == null?null:var2[6])).g);
                           } else if(var43 == 2) {
                              iw.a(var41, var40, ((aa)(var2 != null?var2[6]:null)).g, var39, (byte)15, var4, var42, 0);
                              iw.a(var41, var40, ((aa)(var2 != null?var2[6]:null)).g, var39, (byte)15, var4, var42, ((aa)(null != var2?var2[6]:null)).g);
                              iw.a(var41, var40, 0, var39, (byte)15, var4, var42, 0);
                           } else if(5 != var43) {
                              if(4 == var43) {
                                 iw.a(var41, var40, 0, var39, (byte)15, var4, var42, ((aa)(null == var2?null:var2[6])).g);
                                 iw.a(var41, var40, 0, var39, (byte)15, var4, var42, 0);
                                 iw.a(var41, var40, ((aa)(var2 == null?null:var2[6])).g, var39, (byte)15, var4, var42, ((aa)(null == var2?null:var2[6])).g);
                              }
                           } else {
                              iw.a(var41, var40, ((aa)(null == var2?null:var2[6])).g, var39, (byte)15, var4, var42, ((aa)(null != var2?var2[6]:null)).g);
                              iw.a(var41, var40, 0, var39, (byte)15, var4, var42, ((aa)(var2 == null?null:var2[6])).g);
                              iw.a(var41, var40, ((aa)(null == var2?null:var2[6])).g, var39, (byte)15, var4, var42, 0);
                           }
                        }
                     }

                     ++var41;
                     ++var38;
                  }
               } else {
                  var38 += -((int[])((int[])var4[1]))[5] + ((int[])((int[])var4[1]))[0];
               }

               ++var39;
            }

            var4[10] = bqa.a((byte[])((byte[])((Object[])((Object[])var4[11]))[2]), 3, (Object[])((Object[])var4[13]), 5123, ((int[])((int[])((Object[])((Object[])var4[11]))[1]))[0], false);
            var4[12] = hq.a((Object[])((Object[])var4[13]), ((int[])((int[])((Object[])((Object[])var4[0]))[1]))[0], false, 16, (byte[])((byte[])((Object[])((Object[])var4[0]))[2]), false);
            var4[6] = dq.a((Object[])((Object[])var4[12]), 5126, 3, 0, new Object[3], 3);
            var4[7] = dq.a((Object[])((Object[])var4[12]), 5121, 4, 12, new Object[3], 3);
         }

         var4[14] = null;
         var4[8] = null;
         var4[11] = null;
         var4[5] = null;
         var4[0] = null;
         var4[9] = null;
         return var4;
      }
   }

   static final boolean a(int var0, Object[] var1, int var2, int var3, int var4) {
      ++c;
      int var5 = ((int[])((int[])var1[0]))[0];
      if(((int[])((int[])var1[0]))[1] == var2 && 0 == ((int[])((int[])var1[0]))[0]) {
         return false;
      } else {
         boolean var6;
         int var7;
         if(-1 != ~((int[])((int[])var1[0]))[0]) {
            int var8;
            if(-1 > ~((int[])((int[])var1[0]))[0] && ~var2 < ~((int[])((int[])var1[0]))[1]) {
               var7 = ((int[])((int[])var1[0]))[0] * ((int[])((int[])var1[0]))[0] / (2 * var4);
               var8 = var7 + ((int[])((int[])var1[0]))[1];
               if(var2 > var8 && var8 >= ((int[])((int[])var1[0]))[1]) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else if(((int[])((int[])var1[0]))[0] < 0 && var2 < ((int[])((int[])var1[0]))[1]) {
               var7 = ((int[])((int[])var1[0]))[0] * ((int[])((int[])var1[0]))[0] / (2 * var4);
               var8 = -var7 + ((int[])((int[])var1[0]))[1];
               if(var8 > var2 && var8 <= ((int[])((int[])var1[0]))[1]) {
                  var6 = true;
               } else {
                  var6 = false;
               }
            } else {
               var6 = false;
            }
         } else {
            if(var2 > ((int[])((int[])var1[0]))[1] && ((int[])((int[])var1[0]))[1] + var4 >= var2 || ((int[])((int[])var1[0]))[1] > var2 && ~var2 <= ~(((int[])((int[])var1[0]))[1] + -var4)) {
               ((int[])((int[])var1[0]))[1] = var2;
               return false;
            }

            var6 = true;
         }

         if(!var6) {
            if(-1 <= ~((int[])((int[])var1[0]))[0]) {
               ((int[])((int[])var1[0]))[0] += var4;
               if(0 < ((int[])((int[])var1[0]))[0]) {
                  ((int[])((int[])var1[0]))[0] = 0;
               }
            } else {
               ((int[])((int[])var1[0]))[0] -= var4;
               if(0 > ((int[])((int[])var1[0]))[0]) {
                  ((int[])((int[])var1[0]))[0] = 0;
               }
            }
         } else {
            if(~var2 >= ~((int[])((int[])var1[0]))[1]) {
               ((int[])((int[])var1[0]))[0] -= var4;
               if(0 != var0 && ~((int[])((int[])var1[0]))[0] > ~(-var0)) {
                  ((int[])((int[])var1[0]))[0] = -var0;
               }
            } else {
               ((int[])((int[])var1[0]))[0] += var4;
               if(var0 != 0 && var0 < ((int[])((int[])var1[0]))[0]) {
                  ((int[])((int[])var1[0]))[0] = var0;
               }
            }

            if(((int[])((int[])var1[0]))[0] != var5) {
               var7 = ((int[])((int[])var1[0]))[0] * ((int[])((int[])var1[0]))[0] / (var4 * 2);
               if(((int[])((int[])var1[0]))[1] >= var2) {
                  if(~var2 > ~((int[])((int[])var1[0]))[1] && var2 > ((int[])((int[])var1[0]))[1] - var7) {
                     ((int[])((int[])var1[0]))[0] = var5;
                  }
               } else if(var2 < ((int[])((int[])var1[0]))[1] + var7) {
                  ((int[])((int[])var1[0]))[0] = var5;
               }
            }
         }

         ((int[])((int[])var1[var3]))[1] += ((int[])((int[])var1[0]))[0] + var5 >> 1;
         return var6;
      }
   }

}

import java.io.IOException;
import java.net.InetAddress;
import java.net.URL;

final class ok {

   static int c;
   static Object[] d = ab.a(new Object[2], (byte)114);
   static int a;
   static int b;


   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5) {
      if(((Object[])((Object[])var0[5]))[7] != null) {
         var2 += ((int[])((int[])var0[6]))[var1];
         var3 += ((int[])((int[])var0[0]))[var1];
         int var6 = ((int[])((int[])var0[2]))[var1];
         int var7 = ((int[])((int[])var0[4]))[var1];
         int var8 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
         int var9 = var2 + var3 * var8;
         int var10 = var8 - var6;
         int var11 = 0;
         int var12 = 0;
         int var13;
         if(var3 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16]) {
            var13 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16] - var3;
            var7 -= var13;
            var3 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16];
            var12 += var13 * var6;
            var9 += var13 * var8;
         }

         if(var0 != null && var0.length == 28 && var0[2].equals(Integer.valueOf(0))) {
            a((Object[])null, (byte[])null, (int[])null, 105, -44, -10, 23, -121, 60, 102);
         }

         if(var3 + var7 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1]) {
            var7 -= var3 + var7 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1];
         }

         if(var2 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7]) {
            var13 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7] - var2;
            var6 -= var13;
            var2 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
            var12 += var13;
            var9 += var13;
            var11 += var13;
            var10 += var13;
         }

         if(var2 + var6 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19]) {
            var13 = var2 + var6 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19];
            var6 -= var13;
            var11 += var13;
            var10 += var13;
         }

         if(var6 > 0 && var7 > 0) {
            a(var0, ((byte[][])((byte[][])var0[3]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), var4, var12, var9, var6, var7, var10, var11);
         }
      }
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      if(var0 != null && var0.length == 13 && var0[4].equals(Boolean.valueOf(false)) && var0[4].equals(Integer.valueOf(2))) {
         a((Object[])null, '\uff80', 88, -102, 9, true);
      }

      for(int var10 = -var7; var10 < 0; ++var10) {
         for(int var11 = -var6; var11 < 0; ++var11) {
            int var12 = var1[var4++] & 255;
            if(var12 != 0) {
               int var13 = ((var3 & 16711935) * var12 & -16711936) + ((var3 & '\uff00') * var12 & 16711680) >> 8;
               var12 = 256 - var12;
               int var14 = var2[var5];
               var2[var5++] = (((var14 & 16711935) * var12 & -16711936) + ((var14 & '\uff00') * var12 & 16711680) >> 8) + var13;
            } else {
               ++var5;
            }
         }

         var5 += var8;
         var4 += var9;
      }

   }

   static final int a(boolean var0, Object[] var1, int var2) {
      ++c;
      Object[] var3 = hda.a(fv.d, var2, -125);
      int var4 = ((int[])((int[])var3[0]))[1];
      int var5 = ((int[])((int[])var3[0]))[2];
      int var6 = ((int[])((int[])var3[0]))[0];
      if(var0) {
         ((int[])((int[])var1[9]))[1] = 100;
      }

      int var7 = tba.f[var6 - var5];
      return var7 & ((int[])((int[])var1[2]))[var4] >> var5;
   }

   private static final void a(Object[] var0, byte[] var1, int[] var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, Class_s var13, int var14, int var15) {
      bk var16;
      Object[] var17 = (var16 = (bk)var13) == null?null:var16.f_l;
      int[] var18 = (int[])((int[])var17[0]);
      int[] var19 = (int[])((int[])var17[2]);
      int var20 = var10 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
      int var21 = var11;
      if(var15 > var11) {
         var21 = var15;
         var5 += (var15 - var11) * ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
         var4 += (var15 - var11) * var12;
      }

      if(var0 == null || var0.length != 1 || !var0[0].equals(Integer.valueOf(1)) || !var0[0].equals(Integer.valueOf(1))) {
         int var22 = var15 + var18.length < var11 + var7?var15 + var18.length:var11 + var7;

         for(int var23 = var21; var23 < var22; ++var23) {
            int var24 = var18[var23 - var15] + var14;
            int var25 = var19[var23 - var15];
            int var26 = var6;
            if(var0 != null && (var0.length == 5 || var0.length == 5)) {
               a((Object[])null, '\uffd3', -82, 87, 42, false, (Class_s)null, -45, 18);
            }

            int var27;
            if(var20 > var24) {
               var27 = var20 - var24;
               if(var27 >= var25) {
                  var4 += var6 + var9;
                  var5 += var6 + var8;
                  continue;
               }

               var25 -= var27;
            } else {
               var27 = var24 - var20;
               if(var27 >= var6) {
                  var4 += var6 + var9;
                  var5 += var6 + var8;
                  continue;
               }

               var4 += var27;
               var26 = var6 - var27;
               var5 += var27;
            }

            var27 = 0;
            if(var26 < var25) {
               var25 = var26;
            } else {
               var27 = var26 - var25;
            }

            for(int var28 = -var25; var28 < 0; ++var28) {
               int var29 = var1[var4++] & 255;
               if(var29 != 0) {
                  int var30 = ((var3 & 16711935) * var29 & -16711936) + ((var3 & '\uff00') * var29 & 16711680) >> 8;
                  var29 = 256 - var29;
                  int var31 = var2[var5];
                  var2[var5++] = (((var31 & 16711935) * var29 & -16711936) + ((var31 & '\uff00') * var29 & 16711680) >> 8) + var30;
               } else {
                  ++var5;
               }
            }

            var4 += var27 + var9;
            var5 += var27 + var8;
         }

      }
   }

   static final void a(Object[] var0, char var1, int var2, int var3, int var4, boolean var5, Class_s var6, int var7, int var8) {
      if(((Object[])((Object[])var0[5]))[7] != null) {
         if(var6 == null) {
            a(var0, var1, var2, var3, var4, var5);
         } else {
            var2 += ((int[])((int[])var0[6]))[var1];
            var3 += ((int[])((int[])var0[0]))[var1];
            int var9 = ((int[])((int[])var0[2]))[var1];
            int var10 = ((int[])((int[])var0[4]))[var1];
            int var11 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[4];
            int var12 = var2 + var3 * var11;
            int var13 = var11 - var9;
            int var14 = 0;
            int var15 = 0;
            int var16;
            if(var3 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16] - var3;
               var10 -= var16;
               var3 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[16];
               var15 += var16 * var9;
               var12 += var16 * var11;
            }

            if(var3 + var10 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1]) {
               var10 -= var3 + var10 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[1];
            }

            if(var2 < ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7]) {
               var16 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7] - var2;
               var9 -= var16;
               var2 = ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[7];
               var15 += var16;
               var12 += var16;
               var14 += var16;
               var13 += var16;
            }

            if(var2 + var9 > ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19]) {
               var16 = var2 + var9 - ((int[])((int[])((Object[])((Object[])var0[5]))[1]))[19];
               var9 -= var16;
               var14 += var16;
               var13 += var16;
            }

            if(var9 > 0 && var10 > 0) {
               a(var0, ((byte[][])((byte[][])var0[3]))[var1], (int[])((int[])((Object[])((Object[])var0[5]))[7]), var4, var15, var12, var9, var10, var13, var14, var2, var3, ((int[])((int[])var0[2]))[var1], var6, var7, var8);
            }
         }
      }
   }

   static final void a(byte var0) {
      try {
         ++b;
         if(7 != to.a && 107 != to.a) {
            try {
               short var1;
               if(uk.b == 0) {
                  var1 = 250;
               } else {
                  var1 = 2000;
               }

               if(264 != ww.r || 206 != to.a && jha.e != 42) {
                  ++bia.g;
               }

               if(sn.g && to.a >= 64) {
                  var1 = 6000;
               }

               if(bia.g > var1) {
                  ica.a(kv.e, false);
                  if(uk.b >= 3) {
                     to.a = 7;
                     ul.a(-5, (byte)-100);
                     return;
                  }

                  if(ww.r != 264) {
                     fd.a(ri.j, true);
                  } else {
                     fd.a(ma.q, true);
                  }

                  ++uk.b;
                  to.a = 17;
                  bia.g = 0;
               }

               if(var0 != -79) {
                  a((Object[])null, (byte[])null, (int[])((int[])d[7]), 80, 26, -31, -101, 40, 36, ((int[])((int[])d[7]))[0]);
               }

               Object[] var2;
               int var3;
               Object[] buffer0;
               int var5;
               if(to.a == 17) {
                  if(264 != ww.r) {
                     kv.e[8] = cq.createSocketWorker(sf.createSocket(ri.j), 15000);
                  } else {
                     kv.e[8] = cq.createSocketWorker(sf.createSocket(ma.q), 15000);
                  }

                  ci.a(-24269, kv.e);
                  var2 = gqa.a(var0 ^ -26);
                  if(sn.g) {
                     ek.putByte((Object[])((Object[])var2[0]), ((int[])((int[])dfa.b[0]))[0]);
                     eda.putShort((Object[])((Object[])var2[0]), 0);
                     var3 = ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0];
                     op.putInt((Object[])((Object[])var2[0]), 670);
                     op.putInt((Object[])((Object[])var2[0]), 1);
                     if(ww.r == 264) {
                        ek.putByte((Object[])((Object[])var2[0]), 14 != ipa.d?0:1);
                     }

                     buffer0 = tia.createCskBuffer(-124);
                     ek.putByte(buffer0, ce.a);
                     eda.putShort(buffer0, (int)(Math.random() * 9.9999999E7D));
                     ek.putByte(buffer0, dp.y);
                     op.putInt(buffer0, ji.f);

                     for(var5 = 0; var5 < 6; ++var5) {
                        op.putInt(buffer0, (int)(Math.random() * 9.9999999E7D));
                     }

                     wb.putLong(buffer0, nca.e);
                     ek.putByte(buffer0, ((int[])((int[])fsa.g[1]))[0]);
                     ek.putByte(buffer0, (int)(9.9999999E7D * Math.random()));
                     mj.a(false, sd.a, ska.b, buffer0);
                     lr.a(((int[])((int[])buffer0[1]))[0], (byte[])((byte[])buffer0[2]), 20244, 0, (Object[])((Object[])var2[0]));
                     fp.a(var0 ^ 11464, (Object[])((Object[])var2[0]), ((int[])((int[])((Object[])((Object[])var2[0]))[1]))[0] + -var3);
                  } else {
                     ek.putByte((Object[])((Object[])var2[0]), ((int[])((int[])dfa.LOGINSERVERPACKET[0]))[0]);
                  }

                  lj.a(var2, 6, kv.e);
                  dv.a((byte)88, kv.e);
                  to.a = 35;
               }

               int var18;
               if(to.a == 35) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -107, 1)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                  var18 = ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0] & 255;
                  if(0 != var18) {
                     to.a = 7;
                     ul.a(var18, (byte)94);
                     ica.a(kv.e, false);
                     uc.a(false);
                     return;
                  }

                  if(!sn.g) {
                     to.a = 80;
                  } else {
                     to.a = 48;
                  }
               }

               if(48 == to.a) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -117, 2)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 2);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = de.a((int)0, (Object[])((Object[])kv.e[4]));
                  to.a = 55;
               }

               if(55 == to.a) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 126, ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0])) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0]);
                  haa.a(maa.csk, (Object[])((Object[])kv.e[4]), (byte)-118);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  String var19 = wta.a((byte)-44, (Object[])((Object[])kv.e[4]));
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  String var20 = "opensn";
                  if(!hfa.a || !era.a(var19, var0 ^ -1479, var20, 1, kqa.h)) {
                     iaa.a(false, 1 == bg.a(true, (Object[])((Object[])tu.d[5])), ol.e, kqa.h, var0 + 78, lv.x, var20, var19, true);
                  }

                  to.a = 64;
               }

               if(64 == to.a) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -96, 1)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                  if((255 & ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0]) == 1) {
                     to.a = 74;
                  }
               }

               if(to.a == 74) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -103, 16)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 16);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 16;
                  haa.a(maa.csk, (Object[])((Object[])kv.e[4]), (byte)-113);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  tba.c = qca.f = rna.a(Class_i.a(false, (Object[])((Object[])kv.e[4])), 30);
                  fw.b = Class_i.a(false, (Object[])((Object[])kv.e[4]));
                  to.a = 80;
               }

               Object[] var7;
               Object[] buffer1;
               int var24;
               if(to.a == 80) {
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  ci.a(var0 ^ 24194, kv.e);
                  var2 = gqa.a(var0 ^ -117);
                  buffer1 = (Object[])((Object[])var2[0]);
                  int var6;
                  if(264 != ww.r) {
                     if(!sn.g) {
                        buffer0 = dfa.LOBBYSERVERPACKET;
                     } else {
                        buffer0 = dfa.t;
                     }

                     ek.putByte(buffer1, ((int[])((int[])buffer0[0]))[0]);
                     eda.putShort(buffer1, 0);
                     var5 = ((int[])((int[])buffer1[1]))[0];
                     var6 = ((int[])((int[])buffer1[1]))[0];
                     if(!sn.g) {
                        op.putInt(buffer1, 670);
                        op.putInt(buffer1, 1);
                        var7 = kha.a(true);
                        lr.a(((int[])((int[])var7[1]))[0], (byte[])((byte[])var7[2]), 20244, 0, buffer1);
                        var6 = ((int[])((int[])buffer1[1]))[0];
                        bw.a(tba.c, (byte)0, buffer1);
                     }

                     ek.putByte(buffer1, ((int[])((int[])fsa.g[1]))[0]);
                     ek.putByte(buffer1, dp.y);
                     rea.a(24, buffer1);
                     bw.a(rna.d, (byte)0, buffer1);
                     op.putInt(buffer1, ji.f);
                     op.putInt(buffer1, poa.g);
                     bw.a(oqa.c, (byte)0, buffer1);
                     rda.a(buffer1, (byte)56);
                     mo.a(var0 + 72, ((int[])((int[])buffer1[1]))[0], maa.csk, var6, buffer1);
                     fp.a(-11399, buffer1, -var5 + ((int[])((int[])buffer1[1]))[0]);
                  } else {
                     if(sn.g) {
                        buffer0 = dfa.t;
                     } else {
                        buffer0 = dfa.LOGINRESPONSEPACKET;
                     }
                     ek.putByte(buffer1, ((int[])((int[])buffer0[0]))[0]);
                     eda.putShort(buffer1, 0);
                     var5 = ((int[])((int[])buffer1[1]))[0];
                     var6 = ((int[])((int[])buffer1[1]))[0];
                     if(!sn.g) {
                        op.putInt(buffer1, 670);
                        op.putInt(buffer1, 1);
                        ek.putByte(buffer1, ipa.d != 14 ? 0 : 1);
                        var6 = ((int[])((int[])buffer1[1]))[0];
                        var7 = kha.a(true);
                        lr.a(((int[])((int[])var7[1]))[0], (byte[])((byte[])var7[2]), 20244, 0, buffer1);
                        var6 = ((int[])((int[])buffer1[1]))[0];
                        bw.a(tba.c, (byte)0, buffer1);
                     }

                     ek.putByte(buffer1, afa.b((byte)-85));
                     eda.putShort(buffer1, wr.n);
                     eda.putShort(buffer1, nma.a);
                     ek.putByte(buffer1, kea.b(45, (Object[])((Object[])tu.d[37])));
                     rea.a(24, buffer1);
                     bw.a(rna.d, (byte)0, buffer1);
                     op.putInt(buffer1, ji.f);
                     var7 = db.a(tu.d, (int)112);
                     ek.putByte(buffer1, ((int[])((int[])var7[1]))[0]);
                     lr.a(((int[])((int[])var7[1]))[0], (byte[])((byte[])var7[2]), var0 + 20323, 0, buffer1);
                     mr.f = true;
                     Object[] var8 = hi.newByteBufferWrapper(hl.a(mca.g, 59));
                     ula.a(-29661, var8, mca.g);
                     lr.a(((byte[])((byte[])var8[2])).length, (byte[])((byte[])var8[2]), var0 + 20323, 0, buffer1);
                     op.putInt(buffer1, dca.f_i);
                     wb.putLong(buffer1, ih.e);
                     ek.putByte(buffer1, ai.c != null?1:0);
                     if(ai.c != null) {
                        bw.a(ai.c, (byte)0, buffer1);
                     }

                     if(null != var7 && var7.length == 6) {
                        tsa.a(0);
                     }

                     boolean var10 = it.c.containsKey("jagtheora");
                     ek.putByte(buffer1, !var10?0:1);
                     ek.putByte(buffer1, hfa.a?1:0);
                     ek.putByte(buffer1, !mu.b?0:1);
                     op.putInt(buffer1, poa.g);
                     bw.a(oqa.c, (byte)0, buffer1);
                     rda.a(buffer1, (byte)56);
                     mo.a(var0 + 72, ((int[])((int[])buffer1[1]))[0], maa.csk, var6, buffer1);
                     fp.a(-11399, buffer1, ((int[])((int[])buffer1[1]))[0] - var5);
                  }

                  lj.a(var2, var0 + 85, kv.e);
                  dv.a((byte)102, kv.e);
                  kv.e[7] = gka.newIsaacCipher(maa.csk, new Object[3], 79);

                  for(var24 = 0; var24 < 4; ++var24) {
                     maa.csk[var24] += 50;
                  }

                  kv.e[3] = gka.newIsaacCipher(maa.csk, new Object[3], var0 ^ 49);
                  gka.newIsaacCipher(maa.csk, new Object[3], 27);
                  pa.a(3, (Object[])((Object[])kv.e[3]), (Object[])((Object[])kv.e[4]));
                  to.a = 93;
                  maa.csk = null;
               }

               if(to.a == 93) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -81, 1)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                  var18 = ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0] & 255;
                  if(21 != var18) {
                     if(29 != var18 && var18 != 45) {
                        if(var18 == 1) {
                           to.a = 107;
                           ul.a(var18, (byte)66);
                           return;
                        }

                        if(2 != var18) {
                           if(var18 != 15) {
                              if(var18 == 23 && uk.b < 3) {
                                 to.a = 17;
                                 bia.g = 0;
                                 ++uk.b;
                                 qi.a((Object[])((Object[])kv.e[8]), (int)4);
                                 kv.e[8] = null;
                                 return;
                              }

                              if(42 != var18) {
                                 if(la.f_l && !sn.g && ~ce.a != 0 && 35 == var18) {
                                    sn.g = true;
                                    to.a = 17;
                                    bia.g = 0;
                                    qi.a((Object[])((Object[])kv.e[8]), (int)4);
                                    kv.e[8] = null;
                                    return;
                                 }

                                 to.a = 7;
                                 ul.a(var18, (byte)118);
                                 qi.a((Object[])((Object[])kv.e[8]), var0 + 83);
                                 kv.e[8] = null;
                                 uc.a(false);
                                 return;
                              }

                              to.a = 206;
                              ul.a(var18, (byte)70);
                              return;
                           }

                           to.a = 194;
                           ((int[])((int[])kv.e[1]))[2] = -2;
                        } else {
                           to.a = 136;
                        }
                     } else {
                        to.a = 186;
                        vma.a = var18;
                     }
                  } else {
                     to.a = 127;
                  }
               }

               if(111 == to.a) {
                  ci.a(-24269, kv.e);
                  var2 = gqa.a(49);
                  buffer1 = (Object[])((Object[])var2[0]);
                  pa.a(3, (Object[])((Object[])kv.e[7]), buffer1);
                  mp.a(var0 - 13743, ((int[])((int[])dfa.f[0]))[0], buffer1);
                  lj.a(var2, 6, kv.e);
                  dv.a((byte)64, kv.e);
                  to.a = 93;
                  return;
               }

               if(to.a == 127) {
                  if(ke.a((Object[])((Object[])kv.e[8]), -103, 1)) {
                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                     var18 = ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0] & 255;
                     to.a = 7;
                     ufa.b = var18 * 50;
                     ul.a(21, (byte)125);
                     qi.a((Object[])((Object[])kv.e[8]), (int)4);
                     kv.e[8] = null;
                     uc.a(false);
                     return;
                  }

                  return;
               }

               if(to.a == 206) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -111, 2)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 2);
                  wv.b = ((255 & ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0]) << 8) + (((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[1] & 255);
                  to.a = 93;
                  return;
               }

               if(186 == to.a) {
                  if(vma.a != 29) {
                     if(vma.a != 45) {
                        throw new IllegalStateException();
                     }

                     if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 0, 3)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 3);
                     dl.e = ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0] & 255;
                     vt.e = (((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[1] << 8 & '\uff00') + (((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[2] & 255);
                  } else {
                     if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 18, 1)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                     dl.e = 255 & ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0];
                  }

                  to.a = 7;
                  ul.a(vma.a, (byte)3);
                  qi.a((Object[])((Object[])kv.e[8]), var0 + 83);
                  kv.e[8] = null;
                  uc.a(false);
                  return;
               }

               if(to.a == 136) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -41, 1)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 1);
                  to.a = 146;
                  ol.g = ((byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]))[0] & 255;
                  return;
               }

               if(146 == to.a) {
                  var2 = (Object[])((Object[])kv.e[4]);
                  if(264 != ww.r) {
                     if(!ke.a((Object[])((Object[])kv.e[8]), -83, ol.g)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])var2[2]), 0, ol.g);
                     if(null != var2 && 1 == var2.length && var2[0].equals(Integer.valueOf(2))) {
                        dl.e = 16;
                     }

                     ((int[])((int[])var2[1]))[0] = 0;
                     oda.h = fh.a(var2, false);
                     ri.k = fh.a(var2, false);
                     ng.g = -2 == ~fh.a(var2, false);
                     vfa.b = fh.a(var2, false) == 1;
                     usa.a = fh.a(var2, false) == 1;
                     hka.k = Class_i.a(false, var2);
                     jqa.d = -he.a(-89) + hka.k + -bga.a(var2, -790446368);
                     var3 = fh.a(var2, false);
                     ke.b = -1 != ~(var3 & 1);
                     vqa.f_l = 0 != (2 & var3);
                     tpa.h = lr.a(1, var2);
                     jna.f_i = fh.a(var2, false) == 1;
                     qd.d = lr.a(var0 + 80, var2);
                     ep.h = de.a(var0 ^ -79, var2);
                     jca.f_l = de.a((int)0, var2);
                     le.a = de.a((int)0, var2);
                     qd.g = lr.a(var0 + 80, var2);
                     mg.d = InetAddress.getByAddress(new byte[]{(byte)(255 & qd.g >> 24), (byte)(qd.g >> 16 & 255), (byte)(255 & qd.g >> 8), (byte)(255 & qd.g)}).getHostName();
                     fua.a = fh.a(var2, false);
                     qma.e = de.a((int)0, var2);
                     sf.e = de.a((int)0, var2);
                     wo.d = -2 == ~fh.a(var2, false);
                     uta.g[37] = uta.g[39] = tsa.e = wta.a((byte)-44, var2);
                     jta.d = fh.a(var2, false);
                     lha.g = lr.a(1, var2);
                     ar.c = fh.a(var2, false) == 1;
                     Class_m.a = oe.a(new Object[3]);
                     ((int[])((int[])Class_m.a[1]))[0] = de.a((int)0, var2);
                     if(((int[])((int[])Class_m.a[1]))[0] == '\uffff') {
                        ((int[])((int[])Class_m.a[1]))[0] = -1;
                     }

                     Class_m.a[0] = wta.a((byte)117, var2);
                     if(mka.g != po.f_i) {
                        ((int[])((int[])Class_m.a[1]))[1] = ((int[])((int[])Class_m.a[1]))[0] + '\uc350';
                        ((int[])((int[])Class_m.a[1]))[2] = ((int[])((int[])Class_m.a[1]))[0] + '\u9c40';
                     }

                     if(po.f_i != uca.c && (qt.d != po.f_i || oda.h < 2) && mn.a(63, vha.a, ma.q)) {
                        nfa.a(-57);
                     }
                  } else {
                     if(!ke.a((Object[])((Object[])kv.e[8]), -88, ol.g)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])var2[2]), 0, ol.g);
                     ((int[])((int[])var2[1]))[0] = 0;
                     oda.h = fh.a(var2, false);
                     ri.k = fh.a(var2, false);
                     ng.g = fh.a(var2, false) == 1;
                     vfa.b = fh.a(var2, false) == 1;
                     usa.a = fh.a(var2, false) == 1;
                     aaa.d = 1 == fh.a(var2, false);
                     dp.r = de.a((int)0, var2);
                     ke.b = 1 == fh.a(var2, false);
                     Class_d.b = mja.a(var2, -15308);
                     wba.c = fh.a(var2, false) == 1;
                     ida.q = ara.b((byte)61, var2);
                     buffer1 = lja.d;
                     boolean var25 = wba.c;
                     if(!var25 == ((boolean[])((boolean[])buffer1[5]))[1]) {
                        ((boolean[])((boolean[])buffer1[5]))[1] = var25;
                        jba.a((byte)-108, buffer1);
                     }

                     Object[] var23 = cqa.a;
                     boolean var26 = wba.c;
                     if(!((boolean[])((boolean[])var23[8]))[0] == var26) {
                        ((boolean[])((boolean[])var23[8]))[0] = var26;
                        bd.a(var23, 105);
                     }

                     var7 = nt.f_i;
                     boolean var27 = wba.c;
                     if(((boolean[])((boolean[])var7[8]))[0] != var27) {
                        ((boolean[])((boolean[])var7[8]))[0] = var27;
                        jm.a(var7, 24716);
                     }
                  }

                  if((!ng.g || usa.a) && !ke.b) {
                     try {
                        fu.a("unzap", false, kqa.h);
                     } catch (Throwable var14) {
                        ;
                     }
                  } else {
                     try {
                        fu.a("zap", false, kqa.h);
                     } catch (Throwable var15) {
                        if(vl.b) {
                           try {
                              kqa.h.getAppletContext().showDocument(new URL(kqa.h.getCodeBase(), "blank.ws"), "tbi");
                           } catch (Exception var13) {
                              ;
                           }
                        }
                     }
                  }

                  if(mka.g == po.f_i) {
                     try {
                        fu.a("loggedin", false, kqa.h);
                     } catch (Throwable var12) {
                        ;
                     }
                  }

                  if(264 != ww.r) {
                     to.a = 7;
                     ul.a(2, (byte)-6);
                     qh.a(true);
                     iea.a(5, (byte)-62);
                     kv.e[0] = null;
                     return;
                  }

                  to.a = 165;
               }

               if(165 == to.a) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), -43, 3)) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 3);
                  to.a = 173;
               }

               if(173 == to.a) {
                  var2 = (Object[])((Object[])kv.e[4]);
                  ((int[])((int[])var2[1]))[0] = 0;
                  var24 = 255 & ((byte[])((byte[])var2[2]))[((int[])((int[])var2[1]))[0]] + -qea.b((Object[])((Object[])var2[3]), (byte)50);
                  boolean var22;
                  if(128 <= var24) {
                     var22 = true;
                  } else {
                     var22 = false;
                  }

                  if(var22) {
                     if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 119, 1)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])var2[2]), 3, 1);
                  }

                  kv.e[0] = fea.b(var0 + 78)[cja.a(var0 + 190, var2)];
                  ((int[])((int[])kv.e[1]))[2] = de.a(var0 + 79, var2);
                  to.a = 150;
               }

               if(to.a == 150) {
                  if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 46, ((int[])((int[])kv.e[1]))[2])) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, ((int[])((int[])kv.e[1]))[2]);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  var18 = ((int[])((int[])kv.e[1]))[2];
                  to.a = 7;
                  ul.a(2, (byte)-114);
                  tsa.a(0);
                  vq.a((Object[])((Object[])kv.e[4]), -2057989272);
                  sla.b = -1;
                  if(Class_fs.f != kv.e[0]) {
                     ssa.a((int)-42);
                  } else {
                     vea.a(var0 ^ 38);
                  }

                  if(((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] == var18) {
                     kv.e[0] = null;
                     return;
                  }

                  throw new RuntimeException(((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] + " " + var18);
               }

               if(to.a == 194) {
                  if(1 == ~((int[])((int[])kv.e[1]))[2]) {
                     if(!ke.a((Object[])((Object[])kv.e[8]), var0 ^ 117, 2)) {
                        return;
                     }

                     at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, 2);
                     ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                     ((int[])((int[])kv.e[1]))[2] = de.a(var0 ^ -79, (Object[])((Object[])kv.e[4]));
                  }

                  if(!ke.a((Object[])((Object[])kv.e[8]), -52, ((int[])((int[])kv.e[1]))[2])) {
                     return;
                  }

                  at.readBytesFromInputStreamWorker((Object[])((Object[])kv.e[8]), (byte[])((byte[])((Object[])((Object[])kv.e[4]))[2]), 0, ((int[])((int[])kv.e[1]))[2]);
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  to.a = 7;
                  var18 = ((int[])((int[])kv.e[1]))[2];
                  ul.a(15, (byte)17);
                  ci.a(-24269, kv.e);
                  kv.e[10] = null;
                  ((int[])((int[])kv.e[1]))[4] = 0;
                  ((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] = 0;
                  kv.e[0] = null;
                  kv.e[2] = null;
                  lt.h = 0;
                  ((int[])((int[])kv.e[1]))[2] = 0;
                  kv.e[9] = null;
                  lg.a(-121);
                  bma.m = 0;
                  qs.g = -1;
                  em.c = -1;

                  for(var3 = 0; var3 < 2048; ++var3) {
                     vo.E[var3] = null;
                  }

                  uta.g = null;

                  for(var3 = 0; oqa.g > var3; ++var3) {
                     buffer0 = qoa.b[var3].k;
                     if(null != buffer0) {
                        ((int[])((int[])buffer0[12]))[14] = -1;
                     }
                  }

                  gi.g(var0 ^ 4036);
                  hh.b = -1;
                  nca.a = -1;
                  ha.e = 3;
                  iea.a(10, (byte)-39);

                  for(var3 = 0; 104 > var3; ++var3) {
                     qma.d[var3] = true;
                  }

                  tb.a(false);
                  eb.e = null;
                  tra.b = 0L;
                  vq.a((Object[])((Object[])kv.e[4]), -2057989272);
                  if(~var18 == ~((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0]) {
                     kv.e[0] = null;
                     return;
                  }

                  throw new RuntimeException(((int[])((int[])((Object[])((Object[])kv.e[4]))[1]))[0] + " " + var18);
               }
            } catch (IOException var16) {
               ica.a(kv.e, false);
               if(uk.b < 3) {
                  if(ww.r == 264) {
                     fd.a(ma.q, true);
                  } else {
                     fd.a(ri.j, true);
                  }

                  bia.g = 0;
                  to.a = 17;
                  ++uk.b;
               } else {
                  to.a = 7;
                  ul.a(-4, (byte)41);
                  uc.a(false);
               }
            }

         }
      } catch (RuntimeException var17) {
         throw vt.a(var17, "ok.B(" + var0 + ')');
      }
   }

   static final Object[] a(Object[] var0, Object[] var1, Object[] var2, aea[] var3, int[] var4, int[] var5) {
      ta var9 = (ta)(var1 == null?null:var1[6]);
      tk var8 = new tk(var0, var9, var2);
      var0[1] = var8;
      var0[5] = var1;
      var0[5] = var1;
      var0[2] = var4;
      var0[4] = var5;
      var0[3] = new byte[var3.length][];
      var0[0] = new int[var3.length];
      var0[6] = new int[var3.length];

      for(int var10 = 0; var10 < var3.length; ++var10) {
         aea var11 = var3[var10];
         if(var11.e != null) {
            ((byte[][])((byte[][])var0[3]))[var10] = var11.e;
         } else {
            if(var0 != null && var0.length == 3) {
               return null;
            }

            byte[] var12 = var11.c;
            byte[] var13 = ((byte[][])((byte[][])var0[3]))[var10] = new byte[var12.length];

            for(int var14 = 0; var14 < var12.length; ++var14) {
               var13[var14] = (byte)(var12[var14] == 0?0:-1);
            }
         }

         ((int[])((int[])var0[0]))[var10] = var11.b;
         ((int[])((int[])var0[6]))[var10] = var11.f;
      }

      if(var0 != null && var0.length == 6) {
         return null;
      } else {
         return var0;
      }
   }

}

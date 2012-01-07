
final class ii {

   short[] A;
   int[] o;
   byte[] D;
   Object[][] v;
   int[] f_l;
   byte[] G;
   int a = 12;
   int[] w;
   short[] b;
   byte[] C;
   int[] f_i;
   int[] m;
   int[] z;
   byte[] K;
   Object[][] q;
   byte[] f;
   int[] H;
   int[] h;
   int[] t;
   short[] p;
   short[] F;
   short[] y;
   short[] r;
   int[] j;
   short[] J;
   int[] B;
   int g = 0;
   short[] e;
   int u = 0;
   Object[][] s;
   byte c = 0;
   int k = 0;
   int I = 0;
   short[] E;
   byte[] d;
   byte[] n;
   short[] x;


   final int a(int var1, int var2, int var3, byte var4, byte var5, short var6, byte var7, short var8) {
      this.p[this.I] = (short)var1;
      this.b[this.I] = (short)var2;
      this.J[this.I] = (short)var3;
      this.C[this.I] = var4;
      this.n[this.I] = var5;
      this.A[this.I] = var6;
      this.d[this.I] = var7;
      this.y[this.I] = var8;
      return this.I++;
   }

   private final void a(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Object[] var4 = jta.a((byte)-124, var1, new Object[3]);
      Object[] var5 = jta.a((byte)-114, var1, new Object[3]);
      Object[] var6 = jta.a((byte)-127, var1, new Object[3]);
      Object[] var7 = jta.a((byte)-84, var1, new Object[3]);
      Object[] var8 = jta.a((byte)-83, var1, new Object[3]);
      ((int[])((int[])var4[1]))[0] = var1.length - 18;
      this.u = de.a((int)0, var4);
      this.I = de.a((int)0, var4);
      this.k = fh.a(var4, false);
      int var9 = fh.a(var4, false);
      int var10 = fh.a(var4, false);
      int var11 = fh.a(var4, false);
      int var12 = fh.a(var4, false);
      int var13 = fh.a(var4, false);
      int var14 = de.a((int)0, var4);
      int var15 = de.a((int)0, var4);
      int var16 = de.a((int)0, var4);
      int var17 = de.a((int)0, var4);
      byte var18 = 0;
      int var42 = var18 + this.u;
      int var20 = var42;
      var42 += this.I;
      int var21 = var42;
      if(var10 == 255) {
         var42 += this.I;
      }

      int var22 = var42;
      if(var12 == 1) {
         var42 += this.I;
      }

      int var23 = var42;
      if(var9 == 1) {
         var42 += this.I;
      }

      int var24 = var42;
      if(var13 == 1) {
         var42 += this.u;
      }

      int var25 = var42;
      if(var11 == 1) {
         var42 += this.I;
      }

      int var26 = var42;
      var42 += var17;
      int var27 = var42;
      var42 += this.I * 2;
      int var28 = var42;
      var42 += this.k * 6;
      int var29 = var42;
      var42 += var14;
      int var30 = var42;
      var42 += var15;
      int var10000 = var42 + var16;
      this.f_l = new int[this.u];
      this.h = new int[this.u];
      this.z = new int[this.u];
      this.p = new short[this.I];
      this.b = new short[this.I];
      this.J = new short[this.I];
      if(this.k > 0) {
         this.G = new byte[this.k];
         this.r = new short[this.k];
         this.F = new short[this.k];
         this.E = new short[this.k];
      }

      if(var13 == 1) {
         this.f_i = new int[this.u];
      }

      if(var9 == 1) {
         this.C = new byte[this.I];
         this.n = new byte[this.I];
         this.y = new short[this.I];
      }

      if(var10 == 255) {
         this.D = new byte[this.I];
      } else {
         this.c = (byte)var10;
      }

      if(var11 == 1) {
         this.d = new byte[this.I];
      }

      if(var12 == 1) {
         this.m = new int[this.I];
      }

      this.A = new short[this.I];
      ((int[])((int[])var4[1]))[0] = var18;
      ((int[])((int[])var5[1]))[0] = var29;
      ((int[])((int[])var6[1]))[0] = var30;
      ((int[])((int[])var7[1]))[0] = var42;
      ((int[])((int[])var8[1]))[0] = var24;
      int var32 = 0;
      int var33 = 0;
      int var34 = 0;

      int var35;
      int var39;
      int var36;
      for(var35 = 0; var35 < this.u; ++var35) {
         var36 = fh.a(var4, false);
         int var37 = 0;
         if((var36 & 1) != 0) {
            var37 = kua.a((int)-125, var5);
         }

         int var38 = 0;
         if((var36 & 2) != 0) {
            var38 = kua.a((int)-92, var6);
         }

         var39 = 0;
         if((var36 & 4) != 0) {
            var39 = kua.a((int)-93, var7);
         }

         this.f_l[var35] = var32 + var37;
         this.h[var35] = var33 + var38;
         this.z[var35] = var34 + var39;
         var32 = this.f_l[var35];
         var33 = this.h[var35];
         var34 = this.z[var35];
         if(var13 == 1) {
            this.f_i[var35] = fh.a(var8, false);
         }
      }

      ((int[])((int[])var4[1]))[0] = var27;
      ((int[])((int[])var5[1]))[0] = var23;
      ((int[])((int[])var6[1]))[0] = var21;
      ((int[])((int[])var7[1]))[0] = var25;
      ((int[])((int[])var8[1]))[0] = var22;

      for(var35 = 0; var35 < this.I; ++var35) {
         this.A[var35] = (short)de.a((int)0, var4);
         if(var9 == 1) {
            var36 = fh.a(var5, false);
            if((var36 & 1) == 1) {
               this.C[var35] = 1;
               var2 = true;
            } else {
               this.C[var35] = 0;
            }

            if((var36 & 2) == 2) {
               this.n[var35] = (byte)(var36 >> 2);
               this.y[var35] = this.A[var35];
               this.A[var35] = 127;
               if(this.y[var35] != -1) {
                  var3 = true;
               }
            } else {
               this.n[var35] = -1;
               this.y[var35] = -1;
            }
         }

         if(var10 == 255) {
            this.D[var35] = ipa.a(var6, (int)-84);
         }

         if(var11 == 1) {
            this.d[var35] = ipa.a(var7, (int)-103);
         }

         if(var12 == 1) {
            this.m[var35] = fh.a(var8, false);
         }
      }

      this.g = -1;
      ((int[])((int[])var4[1]))[0] = var26;
      ((int[])((int[])var5[1]))[0] = var20;
      short var43 = 0;
      short var44 = 0;
      short var46 = 0;
      short var45 = 0;

      int var40;
      for(var39 = 0; var39 < this.I; ++var39) {
         var40 = fh.a(var5, false);
         if(var40 == 1) {
            var43 = (short)(kua.a((int)-89, var4) + var45);
            var44 = (short)(kua.a((int)-101, var4) + var43);
            var46 = (short)(kua.a((int)-105, var4) + var44);
            var45 = var46;
            this.p[var39] = var43;
            this.b[var39] = var44;
            this.J[var39] = var46;
            if(var43 > this.g) {
               this.g = var43;
            }

            if(var44 > this.g) {
               this.g = var44;
            }

            if(var46 > this.g) {
               this.g = var46;
            }
         }

         if(var40 == 2) {
            var44 = var46;
            var46 = (short)(kua.a((int)-115, var4) + var45);
            var45 = var46;
            this.p[var39] = var43;
            this.b[var39] = var44;
            this.J[var39] = var46;
            if(var46 > this.g) {
               this.g = var46;
            }
         }

         if(var40 == 3) {
            var43 = var46;
            var46 = (short)(kua.a((int)-122, var4) + var45);
            var45 = var46;
            this.p[var39] = var43;
            this.b[var39] = var44;
            this.J[var39] = var46;
            if(var46 > this.g) {
               this.g = var46;
            }
         }

         if(var40 == 4) {
            short var41 = var43;
            var43 = var44;
            var44 = var41;
            var46 = (short)(kua.a((int)-109, var4) + var45);
            var45 = var46;
            this.p[var39] = var43;
            this.b[var39] = var41;
            this.J[var39] = var46;
            if(var46 > this.g) {
               this.g = var46;
            }
         }
      }

      ++this.g;
      ((int[])((int[])var4[1]))[0] = var28;

      for(var39 = 0; var39 < this.k; ++var39) {
         this.G[var39] = 0;
         this.r[var39] = (short)de.a((int)0, var4);
         this.F[var39] = (short)de.a((int)0, var4);
         this.E[var39] = (short)de.a((int)0, var4);
      }

      if(this.n != null) {
         boolean var47 = false;

         for(var40 = 0; var40 < this.I; ++var40) {
            int var48 = this.n[var40] & 255;
            if(var48 != 255) {
               if((this.r[var48] & '\uffff') == this.p[var40] && (this.F[var48] & '\uffff') == this.b[var40] && (this.E[var48] & '\uffff') == this.J[var40]) {
                  this.n[var40] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if(!var47) {
            this.n = null;
         }
      }

      if(!var3) {
         this.y = null;
      }

      if(!var2) {
         this.C = null;
      }

   }

   final void a(int var1) {
      int var2;
      for(var2 = 0; var2 < this.u; ++var2) {
         this.f_l[var2] <<= var1;
         this.h[var2] <<= var1;
         this.z[var2] <<= var1;
      }

      if(this.k > 0 && this.H != null) {
         for(var2 = 0; var2 < this.H.length; ++var2) {
            this.H[var2] <<= var1;
            this.j[var2] <<= var1;
            if(this.G[var2] != 1) {
               this.t[var2] <<= var1;
            }
         }
      }

   }

   private final void b(byte[] var1) {
      Object[] var2 = jta.a((byte)-91, var1, new Object[3]);
      Object[] var3 = jta.a((byte)-113, var1, new Object[3]);
      Object[] var4 = jta.a((byte)-97, var1, new Object[3]);
      Object[] var5 = jta.a((byte)-121, var1, new Object[3]);
      Object[] var6 = jta.a((byte)-105, var1, new Object[3]);
      Object[] var7 = jta.a((byte)-94, var1, new Object[3]);
      Object[] var8 = jta.a((byte)-114, var1, new Object[3]);
      ((int[])((int[])var2[1]))[0] = var1.length - 23;
      this.u = de.a((int)0, var2);
      this.I = de.a((int)0, var2);
      this.k = fh.a(var2, false);
      int var9 = fh.a(var2, false);
      boolean var10 = (var9 & 1) == 1;
      boolean var11 = (var9 & 2) == 2;
      boolean var12 = (var9 & 4) == 4;
      boolean var13 = (var9 & 8) == 8;
      if(var13) {
         ((int[])((int[])var2[1]))[0] -= 7;
         this.a = fh.a(var2, false);
         ((int[])((int[])var2[1]))[0] += 6;
      }

      int var14 = fh.a(var2, false);
      int var15 = fh.a(var2, false);
      int var16 = fh.a(var2, false);
      int var17 = fh.a(var2, false);
      int var18 = fh.a(var2, false);
      int var19 = de.a((int)0, var2);
      int var20 = de.a((int)0, var2);
      int var21 = de.a((int)0, var2);
      int var22 = de.a((int)0, var2);
      int var23 = de.a((int)0, var2);
      int var24 = 0;
      int var25 = 0;
      int var26 = 0;
      int var27;
      if(this.k > 0) {
         this.G = new byte[this.k];
         ((int[])((int[])var2[1]))[0] = 0;

         for(var27 = 0; var27 < this.k; ++var27) {
            byte var28 = this.G[var27] = ipa.a(var2, (int)-107);
            if(var28 == 0) {
               ++var24;
            }

            if(var28 >= 1 && var28 <= 3) {
               ++var25;
            }

            if(var28 == 2) {
               ++var26;
            }
         }
      }

      var27 = this.k;
      int var66 = var27;
      var27 += this.u;
      int var29 = var27;
      if(var10) {
         var27 += this.I;
      }

      int var30 = var27;
      var27 += this.I;
      int var31 = var27;
      if(var14 == 255) {
         var27 += this.I;
      }

      int var32 = var27;
      if(var16 == 1) {
         var27 += this.I;
      }

      int var33 = var27;
      if(var18 == 1) {
         var27 += this.u;
      }

      int var34 = var27;
      if(var15 == 1) {
         var27 += this.I;
      }

      int var35 = var27;
      var27 += var22;
      int var36 = var27;
      if(var17 == 1) {
         var27 += this.I * 2;
      }

      int var37 = var27;
      var27 += var23;
      int var38 = var27;
      var27 += this.I * 2;
      int var39 = var27;
      var27 += var19;
      int var40 = var27;
      var27 += var20;
      int var41 = var27;
      var27 += var21;
      int var42 = var27;
      var27 += var24 * 6;
      int var43 = var27;
      var27 += var25 * 6;
      byte var44 = 6;
      if(this.a == 14) {
         var44 = 7;
      } else if(this.a >= 15) {
         var44 = 9;
      }

      int var45 = var27;
      var27 += var25 * var44;
      int var46 = var27;
      var27 += var25;
      int var47 = var27;
      var27 += var25;
      int var48 = var27;
      var27 += var25 + var26 * 2;
      this.f_l = new int[this.u];
      this.h = new int[this.u];
      this.z = new int[this.u];
      this.p = new short[this.I];
      this.b = new short[this.I];
      this.J = new short[this.I];
      if(var18 == 1) {
         this.f_i = new int[this.u];
      }

      if(var10) {
         this.C = new byte[this.I];
      }

      if(var14 == 255) {
         this.D = new byte[this.I];
      } else {
         this.c = (byte)var14;
      }

      if(var15 == 1) {
         this.d = new byte[this.I];
      }

      if(var16 == 1) {
         this.m = new int[this.I];
      }

      if(var17 == 1) {
         this.y = new short[this.I];
      }

      if(var17 == 1 && this.k > 0) {
         this.n = new byte[this.I];
      }

      this.A = new short[this.I];
      if(this.k > 0) {
         this.r = new short[this.k];
         this.F = new short[this.k];
         this.E = new short[this.k];
         if(var25 > 0) {
            this.H = new int[var25];
            this.j = new int[var25];
            this.t = new int[var25];
            this.f = new byte[var25];
            this.K = new byte[var25];
            this.B = new int[var25];
         }

         if(var26 > 0) {
            this.w = new int[var26];
            this.o = new int[var26];
         }
      }

      ((int[])((int[])var2[1]))[0] = var66;
      ((int[])((int[])var3[1]))[0] = var39;
      ((int[])((int[])var4[1]))[0] = var40;
      ((int[])((int[])var5[1]))[0] = var41;
      ((int[])((int[])var6[1]))[0] = var33;
      int var50 = 0;
      int var51 = 0;
      int var52 = 0;

      int var53;
      int var57;
      for(var53 = 0; var53 < this.u; ++var53) {
         int var54 = fh.a(var2, false);
         int var55 = 0;
         if((var54 & 1) != 0) {
            var55 = kua.a((int)-103, var3);
         }

         int var56 = 0;
         if((var54 & 2) != 0) {
            var56 = kua.a((int)-92, var4);
         }

         var57 = 0;
         if((var54 & 4) != 0) {
            var57 = kua.a((int)-116, var5);
         }

         this.f_l[var53] = var50 + var55;
         this.h[var53] = var51 + var56;
         this.z[var53] = var52 + var57;
         var50 = this.f_l[var53];
         var51 = this.h[var53];
         var52 = this.z[var53];
         if(var18 == 1) {
            this.f_i[var53] = fh.a(var6, false);
         }
      }

      ((int[])((int[])var2[1]))[0] = var38;
      ((int[])((int[])var3[1]))[0] = var29;
      ((int[])((int[])var4[1]))[0] = var31;
      ((int[])((int[])var5[1]))[0] = var34;
      ((int[])((int[])var6[1]))[0] = var32;
      ((int[])((int[])var7[1]))[0] = var36;
      ((int[])((int[])var8[1]))[0] = var37;

      for(var53 = 0; var53 < this.I; ++var53) {
         this.A[var53] = (short)de.a((int)0, var2);
         if(var10) {
            this.C[var53] = ipa.a(var3, (int)-90);
         }

         if(var14 == 255) {
            this.D[var53] = ipa.a(var4, (int)-98);
         }

         if(var15 == 1) {
            this.d[var53] = ipa.a(var5, (int)-80);
         }

         if(var16 == 1) {
            this.m[var53] = fh.a(var6, false);
         }

         if(var17 == 1) {
            this.y[var53] = (short)(de.a((int)0, var7) - 1);
         }

         if(this.n != null) {
            if(this.y[var53] != -1) {
               this.n[var53] = (byte)(fh.a(var8, false) - 1);
            } else {
               this.n[var53] = -1;
            }
         }
      }

      this.g = -1;
      ((int[])((int[])var2[1]))[0] = var35;
      ((int[])((int[])var3[1]))[0] = var30;
      short var70 = 0;
      short var69 = 0;
      short var67 = 0;
      short var68 = 0;

      int var58;
      for(var57 = 0; var57 < this.I; ++var57) {
         var58 = fh.a(var3, false);
         if(var58 == 1) {
            var70 = (short)(kua.a((int)-106, var2) + var68);
            var69 = (short)(kua.a((int)-125, var2) + var70);
            var67 = (short)(kua.a((int)-93, var2) + var69);
            var68 = var67;
            this.p[var57] = var70;
            this.b[var57] = var69;
            this.J[var57] = var67;
            if(var70 > this.g) {
               this.g = var70;
            }

            if(var69 > this.g) {
               this.g = var69;
            }

            if(var67 > this.g) {
               this.g = var67;
            }
         }

         if(var58 == 2) {
            var69 = var67;
            var67 = (short)(kua.a((int)-118, var2) + var68);
            var68 = var67;
            this.p[var57] = var70;
            this.b[var57] = var69;
            this.J[var57] = var67;
            if(var67 > this.g) {
               this.g = var67;
            }
         }

         if(var58 == 3) {
            var70 = var67;
            var67 = (short)(kua.a((int)-102, var2) + var68);
            var68 = var67;
            this.p[var57] = var70;
            this.b[var57] = var69;
            this.J[var57] = var67;
            if(var67 > this.g) {
               this.g = var67;
            }
         }

         if(var58 == 4) {
            short var59 = var70;
            var70 = var69;
            var69 = var59;
            var67 = (short)(kua.a((int)-110, var2) + var68);
            var68 = var67;
            this.p[var57] = var70;
            this.b[var57] = var59;
            this.J[var57] = var67;
            if(var67 > this.g) {
               this.g = var67;
            }
         }
      }

      ++this.g;
      ((int[])((int[])var2[1]))[0] = var42;
      ((int[])((int[])var3[1]))[0] = var43;
      ((int[])((int[])var4[1]))[0] = var45;
      ((int[])((int[])var5[1]))[0] = var46;
      ((int[])((int[])var6[1]))[0] = var47;
      ((int[])((int[])var7[1]))[0] = var48;

      for(var57 = 0; var57 < this.k; ++var57) {
         var58 = this.G[var57] & 255;
         if(var58 == 0) {
            this.r[var57] = (short)de.a((int)0, var2);
            this.F[var57] = (short)de.a((int)0, var2);
            this.E[var57] = (short)de.a((int)0, var2);
         }

         if(var58 == 1) {
            this.r[var57] = (short)de.a((int)0, var3);
            this.F[var57] = (short)de.a((int)0, var3);
            this.E[var57] = (short)de.a((int)0, var3);
            if(this.a < 15) {
               this.H[var57] = de.a((int)0, var4);
               if(this.a < 14) {
                  this.j[var57] = de.a((int)0, var4);
               } else {
                  this.j[var57] = td.a(var4, 114);
               }

               this.t[var57] = de.a((int)0, var4);
            } else {
               this.H[var57] = td.a(var4, 122);
               this.j[var57] = td.a(var4, 76);
               this.t[var57] = td.a(var4, 104);
            }

            this.f[var57] = ipa.a(var5, (int)-101);
            this.K[var57] = ipa.a(var6, (int)-77);
            this.B[var57] = ipa.a(var7, (int)-122);
         }

         if(var58 == 2) {
            this.r[var57] = (short)de.a((int)0, var3);
            this.F[var57] = (short)de.a((int)0, var3);
            this.E[var57] = (short)de.a((int)0, var3);
            if(this.a < 15) {
               this.H[var57] = de.a((int)0, var4);
               if(this.a < 14) {
                  this.j[var57] = de.a((int)0, var4);
               } else {
                  this.j[var57] = td.a(var4, 100);
               }

               this.t[var57] = de.a((int)0, var4);
            } else {
               this.H[var57] = td.a(var4, 117);
               this.j[var57] = td.a(var4, 78);
               this.t[var57] = td.a(var4, 120);
            }

            this.f[var57] = ipa.a(var5, (int)-101);
            this.K[var57] = ipa.a(var6, (int)-99);
            this.B[var57] = ipa.a(var7, (int)-109);
            this.w[var57] = ipa.a(var7, (int)-101);
            this.o[var57] = ipa.a(var7, (int)-112);
         }

         if(var58 == 3) {
            this.r[var57] = (short)de.a((int)0, var3);
            this.F[var57] = (short)de.a((int)0, var3);
            this.E[var57] = (short)de.a((int)0, var3);
            if(this.a < 15) {
               this.H[var57] = de.a((int)0, var4);
               if(this.a < 14) {
                  this.j[var57] = de.a((int)0, var4);
               } else {
                  this.j[var57] = td.a(var4, 95);
               }

               this.t[var57] = de.a((int)0, var4);
            } else {
               this.H[var57] = td.a(var4, 88);
               this.j[var57] = td.a(var4, 111);
               this.t[var57] = td.a(var4, 92);
            }

            this.f[var57] = ipa.a(var5, (int)-108);
            this.K[var57] = ipa.a(var6, (int)-115);
            this.B[var57] = ipa.a(var7, (int)-109);
         }
      }

      ((int[])((int[])var2[1]))[0] = var27;
      int var60;
      int var71;
      int var73;
      if(var11) {
         var57 = fh.a(var2, false);
         if(var57 > 0) {
            this.s = new Object[var57][];

            for(var58 = 0; var58 < var57; ++var58) {
               var73 = de.a((int)0, var2);
               var60 = de.a((int)0, var2);
               byte var61;
               if(var14 == 255) {
                  var61 = this.D[var60];
               } else {
                  var61 = (byte)var14;
               }

               this.s[var58] = pi.a(new Object[3], var61, 1, this.J[var60], var73, this.b[var60], this.p[var60]);
            }
         }

         var58 = fh.a(var2, false);
         if(var58 > 0) {
            this.q = new Object[var58][];

            for(var73 = 0; var73 < var58; ++var73) {
               var60 = de.a((int)0, var2);
               var71 = de.a((int)0, var2);
               Object[][] var62 = this.q;
               Object[] var65 = new Object[3];
               if(var65[1] == null) {
                  var65[1] = new int[5];
               }

               ((int[])((int[])var65[1]))[0] = var71;
               ((int[])((int[])var65[1]))[4] = var60;
               var62[var73] = var65;
            }
         }
      }

      if(var12) {
         var57 = fh.a(var2, false);
         if(var57 > 0) {
            this.v = new Object[var57][];

            for(var58 = 0; var58 < var57; ++var58) {
               var73 = de.a((int)0, var2);
               var60 = de.a((int)0, var2);
               var71 = fh.a(var2, false);
               byte var72 = ipa.a(var2, (int)-113);
               this.v[var58] = uh.a(var60, var71, var73, new Object[1], var72, (byte)86);
            }
         }
      }

   }

   private final int a(ii var1, int var2, short var3) {
      int var4 = var1.f_l[var2];
      int var5 = var1.h[var2];
      int var6 = var1.z[var2];

      for(int var7 = 0; var7 < this.u; ++var7) {
         if(var4 == this.f_l[var7] && var5 == this.h[var7] && var6 == this.z[var7]) {
            this.e[var7] |= var3;
            return var7;
         }
      }

      this.f_l[this.u] = var4;
      this.h[this.u] = var5;
      this.z[this.u] = var6;
      this.e[this.u] = var3;
      this.f_i[this.u] = var1.f_i != null?var1.f_i[var2]:-1;
      return this.u++;
   }

   final byte a(short var1, short var2, short var3, short var4, short var5, short var6, byte var7, byte var8, byte var9) {
      if(this.k >= 255) {
         throw new IllegalStateException();
      } else {
         this.G[this.k] = 3;
         this.r[this.k] = var1;
         this.F[this.k] = var2;
         this.E[this.k] = var3;
         this.H[this.k] = var4;
         this.j[this.k] = var5;
         this.t[this.k] = var6;
         this.f[this.k] = var7;
         this.K[this.k] = var8;
         this.B[this.k] = var9;
         return (byte)(this.k++);
      }
   }

   static final ii a(Object[] var0, int var1, int var2) {
      byte[] var3 = qn.a(var1, var2, var0, -31);
      return var3 == null?null:new ii(var3);
   }

   final void b(short var1, short var2) {
      for(int var3 = 0; var3 < this.I; ++var3) {
         if(this.A[var3] == var1) {
            this.A[var3] = var2;
         }
      }

   }

   final int[][] b() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.v.length; ++var3) {
         var4 = ((int[])((int[])this.v[var3][0]))[1];
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.v.length; ++var4) {
         int var5 = ((int[])((int[])this.v[var4][0]))[1];
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   final int[][] a() {
      int[] var1 = new int[256];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < this.I; ++var3) {
         var4 = this.m[var3];
         if(var4 >= 0) {
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }
      }

      int[][] var6 = new int[var2 + 1][];

      for(var4 = 0; var4 <= var2; ++var4) {
         var6[var4] = new int[var1[var4]];
         var1[var4] = 0;
      }

      for(var4 = 0; var4 < this.I; ++var4) {
         int var5 = this.m[var4];
         if(var5 >= 0) {
            var6[var5][var1[var5]++] = var4;
         }
      }

      return var6;
   }

   final void b(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u; ++var4) {
         this.f_l[var4] += var1;
         this.h[var4] += var2;
         this.z[var4] += var3;
      }

   }

   final void a(int var1, int var2, int var3) {
      int var4;
      int var5;
      int var6;
      int var7;
      if(var3 != 0) {
         var4 = tda.p[var3];
         var5 = tda.k[var3];

         for(var6 = 0; var6 < this.u; ++var6) {
            var7 = this.h[var6] * var4 + this.f_l[var6] * var5 >> 14;
            this.h[var6] = this.h[var6] * var5 - this.f_l[var6] * var4 >> 14;
            this.f_l[var6] = var7;
         }
      }

      if(var1 != 0) {
         var4 = tda.p[var1];
         var5 = tda.k[var1];

         for(var6 = 0; var6 < this.u; ++var6) {
            var7 = this.h[var6] * var5 - this.z[var6] * var4 >> 14;
            this.z[var6] = this.h[var6] * var4 + this.z[var6] * var5 >> 14;
            this.h[var6] = var7;
         }
      }

      if(var2 != 0) {
         var4 = tda.p[var2];
         var5 = tda.k[var2];

         for(var6 = 0; var6 < this.u; ++var6) {
            var7 = this.z[var6] * var4 + this.f_l[var6] * var5 >> 14;
            this.z[var6] = this.z[var6] * var5 - this.f_l[var6] * var4 >> 14;
            this.f_l[var6] = var7;
         }
      }

   }

   final int c(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.u; ++var4) {
         if(this.f_l[var4] == var1 && this.h[var4] == var2 && this.z[var4] == var3) {
            return var4;
         }
      }

      this.f_l[this.u] = var1;
      this.h[this.u] = var2;
      this.z[this.u] = var3;
      this.g = this.u + 1;
      return this.u++;
   }

   final int[][] a(boolean var1) {
      int[] var2 = new int[256];
      int var3 = 0;
      int var4 = var1?this.u:this.g;

      int var6;
      for(int var5 = 0; var5 < var4; ++var5) {
         var6 = this.f_i[var5];
         if(var6 >= 0) {
            ++var2[var6];
            if(var6 > var3) {
               var3 = var6;
            }
         }
      }

      int[][] var8 = new int[var3 + 1][];

      for(var6 = 0; var6 <= var3; ++var6) {
         var8[var6] = new int[var2[var6]];
         var2[var6] = 0;
      }

      for(var6 = 0; var6 < var4; ++var6) {
         int var7 = this.f_i[var6];
         if(var7 >= 0) {
            var8[var7][var2[var7]++] = var6;
         }
      }

      return var8;
   }

   final void a(short var1, short var2) {
      if(this.y != null) {
         for(int var3 = 0; var3 < this.I; ++var3) {
            if(this.y[var3] == var1) {
               this.y[var3] = var2;
            }
         }

      }
   }

   private ii(byte[] var1) {
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.b(var1);
      } else {
         this.a(var1);
      }

   }

   ii(int var1, int var2, int var3) {
      this.f_l = new int[var1];
      this.h = new int[var1];
      this.z = new int[var1];
      this.f_i = new int[var1];
      this.p = new short[var2];
      this.b = new short[var2];
      this.J = new short[var2];
      this.C = new byte[var2];
      this.D = new byte[var2];
      this.d = new byte[var2];
      this.n = new byte[var2];
      this.A = new short[var2];
      this.y = new short[var2];
      this.m = new int[var2];
      if(var3 > 0) {
         this.G = new byte[var3];
         this.r = new short[var3];
         this.F = new short[var3];
         this.E = new short[var3];
         this.H = new int[var3];
         this.j = new int[var3];
         this.t = new int[var3];
         this.f = new byte[var3];
         this.K = new byte[var3];
         this.B = new int[var3];
         this.w = new int[var3];
         this.o = new int[var3];
      }

   }

   ii(ii[] var1, int var2) {
      this.u = 0;
      this.I = 0;
      this.k = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      boolean var9 = false;
      boolean var10 = false;
      boolean var11 = false;
      this.c = -1;

      int var12;
      for(var12 = 0; var12 < var2; ++var12) {
         ii var13 = var1[var12];
         if(var13 != null) {
            this.u += var13.u;
            this.I += var13.I;
            this.k += var13.k;
            if(var13.s != null) {
               var3 += var13.s.length;
            }

            if(var13.q != null) {
               var4 += var13.q.length;
            }

            if(var13.v != null) {
               var5 += var13.v.length;
            }

            var6 |= var13.C != null;
            if(var13.D != null) {
               var7 = true;
            } else {
               if(this.c == -1) {
                  this.c = var13.c;
               }

               if(this.c != var13.c) {
                  var7 = true;
               }
            }

            var8 |= var13.d != null;
            var9 |= var13.n != null;
            var10 |= var13.y != null;
            var11 |= var13.m != null;
         }
      }

      this.f_l = new int[this.u];
      this.h = new int[this.u];
      this.z = new int[this.u];
      this.f_i = new int[this.u];
      this.e = new short[this.u];
      this.p = new short[this.I];
      this.b = new short[this.I];
      this.J = new short[this.I];
      if(var6) {
         this.C = new byte[this.I];
      }

      if(var7) {
         this.D = new byte[this.I];
      }

      if(var8) {
         this.d = new byte[this.I];
      }

      if(var9) {
         this.n = new byte[this.I];
      }

      this.A = new short[this.I];
      if(var10) {
         this.y = new short[this.I];
      }

      if(var11) {
         this.m = new int[this.I];
      }

      this.x = new short[this.I];
      if(this.k > 0) {
         this.G = new byte[this.k];
         this.r = new short[this.k];
         this.F = new short[this.k];
         this.E = new short[this.k];
         this.H = new int[this.k];
         this.j = new int[this.k];
         this.t = new int[this.k];
         this.f = new byte[this.k];
         this.K = new byte[this.k];
         this.B = new int[this.k];
         this.w = new int[this.k];
         this.o = new int[this.k];
      }

      if(var5 > 0) {
         this.v = new Object[var5][];
      }

      if(var3 > 0) {
         this.s = new Object[var3][];
      }

      if(var4 > 0) {
         this.q = new Object[var4][];
      }

      this.u = 0;
      this.I = 0;
      this.k = 0;
      var3 = 0;
      var4 = 0;
      var5 = 0;

      int var27;
      for(var12 = 0; var12 < var2; ++var12) {
         short var25 = (short)(1 << var12);
         ii var14 = var1[var12];
         if(var14 != null) {
            int var15;
            if(var14.v != null) {
               for(var15 = 0; var15 < var14.v.length; ++var15) {
                  Object[] var16 = var14.v[var15];
                  this.v[var5++] = oca.a(var16, (byte)74, ((int[])((int[])var16[0]))[3] + this.I);
               }
            }

            for(var15 = 0; var15 < var14.I; ++var15) {
               if(var6 && var14.C != null) {
                  this.C[this.I] = var14.C[var15];
               }

               if(var7) {
                  if(var14.D != null) {
                     this.D[this.I] = var14.D[var15];
                  } else {
                     this.D[this.I] = var14.c;
                  }
               }

               if(var8 && var14.d != null) {
                  this.d[this.I] = var14.d[var15];
               }

               if(var10) {
                  if(var14.y != null) {
                     this.y[this.I] = var14.y[var15];
                  } else {
                     this.y[this.I] = -1;
                  }
               }

               if(var11) {
                  if(var14.m != null) {
                     this.m[this.I] = var14.m[var15];
                  } else {
                     this.m[this.I] = -1;
                  }
               }

               this.p[this.I] = (short)this.a(var14, var14.p[var15], var25);
               this.b[this.I] = (short)this.a(var14, var14.b[var15], var25);
               this.J[this.I] = (short)this.a(var14, var14.J[var15], var25);
               this.x[this.I] = var25;
               this.A[this.I] = var14.A[var15];
               ++this.I;
            }

            Object[] var22;
            if(var14.s != null) {
               for(var15 = 0; var15 < var14.s.length; ++var15) {
                  var27 = this.a(var14, ((int[])((int[])var14.s[var15][1]))[10], var25);
                  int var17 = this.a(var14, ((int[])((int[])var14.s[var15][1]))[3], var25);
                  int var18 = this.a(var14, ((int[])((int[])var14.s[var15][1]))[6], var25);
                  Object[][] var19 = this.s;
                  var22 = var14.s[var15];
                  Object[] var21 = pi.a(new Object[3], ((byte[])((byte[])var22[0]))[0], 1, var18, ((int[])((int[])var22[1]))[1], var17, var27);
                  var19[var3] = var21;
                  ++var3;
               }
            }

            if(var14.q != null) {
               for(var15 = 0; var15 < var14.q.length; ++var15) {
                  var27 = this.a(var14, ((int[])((int[])var14.q[var15][1]))[0], var25);
                  Object[][] var30 = this.q;
                  Object[] var20 = var14.q[var15];
                  var22 = new Object[3];
                  int var23 = ((int[])((int[])var20[1]))[4];
                  if(var22[1] == null) {
                     var22[1] = new int[5];
                  }

                  ((int[])((int[])var22[1]))[0] = var27;
                  ((int[])((int[])var22[1]))[4] = var23;
                  var30[var4] = var22;
                  ++var4;
               }
            }
         }
      }

      var12 = 0;
      this.g = this.u;

      for(int var24 = 0; var24 < var2; ++var24) {
         short var26 = (short)(1 << var24);
         ii var28 = var1[var24];
         if(var28 != null) {
            for(var27 = 0; var27 < var28.I; ++var27) {
               if(var9) {
                  this.n[var12++] = (byte)(var28.n != null && var28.n[var27] != -1?var28.n[var27] + this.k:-1);
               }
            }

            for(var27 = 0; var27 < var28.k; ++var27) {
               byte var29 = this.G[this.k] = var28.G[var27];
               if(var29 == 0) {
                  this.r[this.k] = (short)this.a(var28, var28.r[var27], var26);
                  this.F[this.k] = (short)this.a(var28, var28.F[var27], var26);
                  this.E[this.k] = (short)this.a(var28, var28.E[var27], var26);
               }

               if(var29 >= 1 && var29 <= 3) {
                  this.r[this.k] = var28.r[var27];
                  this.F[this.k] = var28.F[var27];
                  this.E[this.k] = var28.E[var27];
                  this.H[this.k] = var28.H[var27];
                  this.j[this.k] = var28.j[var27];
                  this.t[this.k] = var28.t[var27];
                  this.f[this.k] = var28.f[var27];
                  this.K[this.k] = var28.K[var27];
                  this.B[this.k] = var28.B[var27];
               }

               if(var29 == 2) {
                  this.w[this.k] = var28.w[var27];
                  this.o[this.k] = var28.o[var27];
               }

               ++this.k;
            }
         }
      }

   }
}
